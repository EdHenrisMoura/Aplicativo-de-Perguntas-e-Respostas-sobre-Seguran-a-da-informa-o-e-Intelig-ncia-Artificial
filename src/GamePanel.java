
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
        int[] respostasCorretas = ((PerguntaIA) perguntas.get(perguntaAtual)).getRespostasCorretas();

        if (Arrays.stream(respostasCorretas).anyMatch(r -> r == respostaJogador)) {
            pontuacao++;
        }

        perguntaAtual++;
        if (perguntaAtual < perguntas.size()) {
            exibirPergunta(perguntas.get(perguntaAtual));
        } else {
            mostrarResumo();
            
        }
    }

    private String getRespostaCorreta(List<String> alternativas, int[] respostasCorretas) {
        for (int i = 0; i < alternativas.size(); i++) {
            final int indiceAlternativa = i;

            if (Arrays.stream(respostasCorretas).anyMatch(r -> r == indiceAlternativa)) {
                // Substir o marcador de resposta correta (*) e remova espaços em branco
                String respostaCorreta = alternativas.get(i).substring(0).trim();

                // Adicionar o código abaixo para garantir que você está pegando a resposta correta
                if (respostaCorreta.length() > 0) {
                    return respostaCorreta;
                } else {
                    return alternativas.get(i).substring(1).trim(); // Remova apenas o primeiro caractere
                }
            }
        }
        return ""; // Retorna uma string vazia se nenhuma resposta correta for encontrada
    }

    private void mostrarResumo() {
        JTextArea resumoTextArea = new JTextArea("Resumo Final:\n");
        resumoTextArea.setEditable(false);
        resumoTextArea.append("Pontuação Final: " + pontuacao + " de " + perguntas.size() + " perguntas\n\n");

        String pergunta;

        for (int i = 0; i < perguntas.size(); i++) {
            Object perguntaObj = perguntas.get(i);
            List<String> alternativas = null;
            char respostaJogadorChar = ' ';
            
            

            if (perguntaObj instanceof PerguntaIA) {
                PerguntaIA perguntaIA = (PerguntaIA) perguntaObj;
                alternativas = Arrays.asList(perguntaIA.getAlternativas());
                respostaJogadorChar = (char) ('A' + getRespostaJogador(perguntaIA.getAlternativas(), perguntaIA.getRespostasCorretas()));
                pergunta = perguntaIA.getPergunta();
            } else if (perguntaObj instanceof PerguntaSeguranca) {
                PerguntaSeguranca perguntaSeguranca = (PerguntaSeguranca) perguntaObj;
                alternativas = Arrays.asList(perguntaSeguranca.getAlternativas());
                respostaJogadorChar = (char) ('A' + getRespostaJogador(perguntaSeguranca.getAlternativas(), perguntaSeguranca.getRespostasCorretas()));
                pergunta = perguntaSeguranca.getPergunta();
            } else if (perguntaObj instanceof PerguntaMista) {
                PerguntaMista perguntaMista = (PerguntaMista) perguntaObj;
                alternativas = Arrays.asList(perguntaMista.getAlternativas());
                respostaJogadorChar = (char) ('A' + getRespostaJogador(perguntaMista.getAlternativas(), perguntaMista.getRespostasCorretas()));
                pergunta = perguntaMista.getPergunta();
            } else {
                pergunta = ""; 
            }

            resumoTextArea.append("Pergunta " + (i + 1) + " - " + pergunta + ":\n");

            if (i < pontuacao) {
                resumoTextArea.append("Correto\n");
            } else {
                resumoTextArea.append("Incorreto\n");
            }
            
            
            JLabel perguntaLabel = new JLabel("<html>" + pergunta.replaceAll("\\n", "<br>") + "</html>");
            perguntaLabel.setFont(new Font("Arial", Font.PLAIN, 20)); // Ajustar o tamanho da fonte conforme necessário
            resumoTextArea.append("Pergunta " + (i + 1) + " - ");
            resumoTextArea.add(perguntaLabel);  // Adiciona a JLabel no JTextArea

            resumoTextArea.append("Resposta Correta: " + getRespostaCorreta(alternativas, ((PerguntaIA) perguntas.get(i)).getRespostasCorretas()) + "\n");
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
        //resumoPanel.add(new JScrollPane(resumoTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), BorderLayout.CENTER);

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

        // Volte para o menu principal, independentemente da escolha do jogador
        frame.setContentPane(new MainMenuPanel(frame));
        frame.revalidate();
    }

    private void salvarPontuacaoNoTXT(String nomeJogador, int pontuacao, String difficulty) {
        try {
            // Criar ou abrir o arquivo de texto
            FileWriter writer = new FileWriter("scoreboard.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            // Escrever a pontuação, o nome do jogador e a dificuldade no arquivo
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
