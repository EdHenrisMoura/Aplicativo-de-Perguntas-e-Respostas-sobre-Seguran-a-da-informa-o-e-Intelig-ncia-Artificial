import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GamePanel extends JPanel {

    private JFrame frame;
    private List<?> perguntas;
    private String difficulty;
    private int pontuacao = 0;
    private int perguntaAtual = 0;
    private int alternativaEscolhidaPeloJogador; // Novo campo

    public GamePanel(JFrame frame, List<?> perguntas, String difficulty) {
        this.frame = frame;
        this.perguntas = perguntas;
        this.difficulty = difficulty;
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        Collections.shuffle(perguntas);

        exibirPergunta(perguntas.get(perguntaAtual));

        JButton nextButton = new JButton("Próxima Pergunta");
        nextButton.addActionListener(e -> {
            perguntaAtual++;
            if (perguntaAtual < perguntas.size()) {
                exibirPergunta(perguntas.get(perguntaAtual));
            } else {
                mostrarResumo();
            }
        });
        add(nextButton, BorderLayout.SOUTH);

        iniciarJogo(); // Adicionado para iniciar o jogo imediatamente
    }

    public void iniciarJogo() {
        exibirPergunta(perguntas.get(perguntaAtual));
    }

    private void exibirPergunta(Object perguntaObj) {
        String pergunta = "";
        List<String> alternativas = null;

        if (perguntaObj instanceof PerguntaIA) {
            PerguntaIA perguntaIA = (PerguntaIA) perguntaObj;
            pergunta = perguntaIA.getPergunta();
            alternativas = Arrays.asList(perguntaIA.getAlternativas());
        } else if (perguntaObj instanceof PerguntaSeguranca) {
            PerguntaSeguranca perguntaSeguranca = (PerguntaSeguranca) perguntaObj;
            pergunta = perguntaSeguranca.getPergunta();
            alternativas = Arrays.asList(perguntaSeguranca.getAlternativas());
        } else if (perguntaObj instanceof PerguntaMista) {
            PerguntaMista perguntaMista = (PerguntaMista) perguntaObj;
            pergunta = perguntaMista.getPergunta();
            alternativas = Arrays.asList(perguntaMista.getAlternativas());
        }

        if (alternativas != null) {
            exibirJanelaPergunta(pergunta, alternativas);
        }
    }

    private void exibirJanelaPergunta(String pergunta, List<String> alternativas) {
        JPanel alternativasPanel = new JPanel(new GridBagLayout());

        for (int i = 0; i < alternativas.size(); i++) {
            final int respostaJogador = i;
            JButton button = new JButton(alternativas.get(i));

            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    alternativaEscolhidaPeloJogador = respostaJogador; // Armazena a alternativa escolhida pelo jogador
                    verificarResposta(alternativas, respostaJogador);
                }
            });

            // Configurar o tamanho do botão
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = i;
            gbc.weightx = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;

            alternativasPanel.add(button, gbc);
        }

        JPanel perguntaPanel = new JPanel();
        perguntaPanel.setLayout(new BorderLayout());
        perguntaPanel.add(new JLabel(pergunta), BorderLayout.NORTH);
        perguntaPanel.add(alternativasPanel, BorderLayout.CENTER);

        JLabel perguntaLabel = new JLabel("<html>" + pergunta.replaceAll("\\n", "<br>") + "</html>");
        perguntaLabel.setFont(new Font("Arial", Font.PLAIN, 20)); // Ajuste o tamanho da fonte conforme necessário
        perguntaPanel.add(perguntaLabel, BorderLayout.NORTH);

        frame.setContentPane(perguntaPanel);
        frame.revalidate();
    }

    private void verificarResposta(List<String> alternativas, int respostaJogador) {
        Object perguntaObj = perguntas.get(perguntaAtual);

        if (perguntaObj instanceof PerguntaIA) {
            PerguntaIA perguntaIA = (PerguntaIA) perguntaObj;
            int[] respostasCorretas = perguntaIA.getRespostasCorretas();

            if (Arrays.stream(respostasCorretas).anyMatch(r -> r == respostaJogador)) {
                pontuacao++;
            }
        } else if (perguntaObj instanceof PerguntaSeguranca) {
            PerguntaSeguranca perguntaSeguranca = (PerguntaSeguranca) perguntaObj;
            int[] respostasCorretas = perguntaSeguranca.getRespostasCorretas();

            if (Arrays.stream(respostasCorretas).anyMatch(r -> r == respostaJogador)) {
                pontuacao++;
            }
        } else if (perguntaObj instanceof PerguntaMista) {
            PerguntaMista perguntaMista = (PerguntaMista) perguntaObj;
            int[] respostasCorretas = perguntaMista.getRespostasCorretas();

            if (Arrays.stream(respostasCorretas).anyMatch(r -> r == respostaJogador)) {
                pontuacao++;
            }
        }

        perguntaAtual++;
        if (perguntaAtual < perguntas.size()) {
            exibirPergunta(perguntas.get(perguntaAtual));
        } else {
            mostrarResumo();
        }
    }

    private String getRespostaCorreta(List<String> alternativas, char respostaJogadorChar) {
        int indiceRespostaJogador = respostaJogadorChar - 'A';

        if (indiceRespostaJogador >= 0 && indiceRespostaJogador < alternativas.size()) {
            // Substitui o marcador de resposta correta (*) e remover espaços em branco
            String respostaCorreta = alternativas.get(indiceRespostaJogador).substring(0).trim();

            // Adiciona o código abaixo para garantir que você está pegando a resposta correta
            if (respostaCorreta.length() > 0) {
                return respostaCorreta;
            } else {
                return alternativas.get(indiceRespostaJogador).substring(1).trim(); // Remover apenas o primeiro caractere
            }
        }

        return ""; // Retorna uma string vazia se a resposta do jogador estiver fora dos limites
    }

    private void mostrarResumo() {
        JTextArea resumoTextArea = new JTextArea("Resumo Final:\n");
        resumoTextArea.setEditable(false);
        resumoTextArea.append("Pontuação Final: " + pontuacao + " de " + perguntas.size() + " perguntas\n\n");

        for (int i = 0; i < perguntas.size(); i++) {
            Object perguntaObj = perguntas.get(i);
            List<String> alternativas = null;
            char respostaJogadorChar = (char) ('A' + alternativaEscolhidaPeloJogador);

            if (perguntaObj instanceof PerguntaIA) {
                PerguntaIA perguntaIA = (PerguntaIA) perguntaObj;
                alternativas = Arrays.asList(perguntaIA.getAlternativas());
            } else if (perguntaObj instanceof PerguntaSeguranca) {
                PerguntaSeguranca perguntaSeguranca = (PerguntaSeguranca) perguntaObj;
                alternativas = Arrays.asList(perguntaSeguranca.getAlternativas());
            } else if (perguntaObj instanceof PerguntaMista) {
                PerguntaMista perguntaMista = (PerguntaMista) perguntaObj;
                alternativas = Arrays.asList(perguntaMista.getAlternativas());
            } else {
                continue; // Pula para a próxima iteração do loop se a pergunta não for reconhecida
            }

            String pergunta = "";
            if (perguntaObj instanceof PerguntaIA) {
                pergunta = ((PerguntaIA) perguntaObj).getPergunta();
            } else if (perguntaObj instanceof PerguntaSeguranca) {
                pergunta = ((PerguntaSeguranca) perguntaObj).getPergunta();
            } else if (perguntaObj instanceof PerguntaMista) {
                pergunta = ((PerguntaMista) perguntaObj).getPergunta();
            }

            resumoTextArea.append("Pergunta " + (i + 1) + " - " + pergunta + ":\n");

            if (i < pontuacao) {
                resumoTextArea.append("Correto\n");
            } else {
                resumoTextArea.append("Incorreto\n");
            }

            JLabel perguntaLabel = new JLabel("<html>" + pergunta.replaceAll("\\n", "<br>") + "</html>");
            perguntaLabel.setFont(new Font("Arial", Font.PLAIN, 20)); // Ajustar o tamanho da fonte conforme necessário
            resumoTextArea.append("Resposta Correta: " + getRespostaCorreta(alternativas, respostaJogadorChar) + "\n");
            resumoTextArea.append("Resposta do Jogador: " + (i < pontuacao ? "Correta" : "Incorreta") + "\n\n");
        }

        JButton backButton = new JButton("Voltar ao Menu Inicial");
        backButton.addActionListener(e -> {
            int opcaoSalvar = JOptionPane.showConfirmDialog(frame, "Você quer salvar sua pontuação?", "Salvar Pontuação",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (opcaoSalvar == JOptionPane.YES_OPTION) {
                String nomeJogador = JOptionPane.showInputDialog(frame, "Digite seu nome:", "Fim do Jogo",
                        JOptionPane.QUESTION_MESSAGE);

                if (nomeJogador != null && !nomeJogador.isEmpty()) {
                    salvarPontuacaoNoTXT(nomeJogador, pontuacao, difficulty);

                    String mensagem = "Nome: " + nomeJogador + "\nPontuação: " + pontuacao;
                    JOptionPane.showMessageDialog(frame, mensagem, "Pontuação Final", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            frame.setContentPane(new MainMenuPanel(frame));
            frame.revalidate();
        });

        JPanel resumoPanel = new JPanel(new BorderLayout());
        resumoPanel.add(new JScrollPane(resumoTextArea), BorderLayout.CENTER);
        resumoPanel.add(backButton, BorderLayout.SOUTH);

        frame.setContentPane(resumoPanel);
        frame.revalidate();
    }

    private int getRespostaJogador(String[] alternativas, int[] respostasCorretas) {
        for (int i = 0; i < alternativas.length; i++) {
            final int indice = i;
            if (alternativas[i].startsWith("*")) {
                if (Arrays.stream(respostasCorretas).anyMatch(r -> r == indice)) {
                    return indice; // Retorna o índice da opção escolhida pelo jogador
                }
            }
        }
        return -1; // Retorna -1 se nenhuma resposta do jogador for encontrada
    }

    private void solicitarNomeJogador() {
        int opcaoSalvar = JOptionPane.showConfirmDialog(frame, "Você quer salvar sua pontuação?", "Salvar Pontuação",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opcaoSalvar == JOptionPane.YES_OPTION) {
            String nomeJogador = JOptionPane.showInputDialog(frame, "Digite seu nome:", "Fim do Jogo",
                    JOptionPane.QUESTION_MESSAGE);

            if (nomeJogador != null && !nomeJogador.isEmpty()) {
                salvarPontuacaoNoTXT(nomeJogador, pontuacao, difficulty);

                String mensagem = "Nome: " + nomeJogador + "\nPontuação: " + pontuacao;
                JOptionPane.showMessageDialog(frame, mensagem, "Pontuação Final", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        frame.setContentPane(new MainMenuPanel(frame));
        frame.revalidate();
    }

    private void salvarPontuacaoNoTXT(String nomeJogador, int pontuacao, String difficulty) {
        try {
            // Cria ou abre o arquivo de texto
            FileWriter writer = new FileWriter("scoreboard.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            // Escreve a pontuação, o nome do jogador e a dificuldade no arquivo
            bufferedWriter.write(nomeJogador + " - " + pontuacao + " - " + difficulty);
            bufferedWriter.newLine();

            // Fechar o arquivo
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Erro ao salvar pontuação", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
