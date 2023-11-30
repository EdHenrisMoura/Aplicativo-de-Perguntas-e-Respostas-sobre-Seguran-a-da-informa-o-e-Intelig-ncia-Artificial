import java.util.Collections;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QuizGame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Quiz Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 900);
            frame.setLocationRelativeTo(null);

            MainMenuPanel mainMenuPanel = new MainMenuPanel(frame);
            frame.setContentPane(mainMenuPanel);

            frame.setVisible(true);
        });
    }
}

class MainMenuPanel extends JPanel {

    private JFrame frame;

    public MainMenuPanel(JFrame frame) {
        this.frame = frame;
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(6, 1));

        add(new JLabel("Bem-vindo ao jogo de quiz", SwingConstants.CENTER));
        addButton("Jogar", e -> showCategoryScreen());
        addButton("Sobre o Jogo", e -> showTextScreen("Jogo de perguntas e respostas onde você escolhe sua caterogia, e em seguida a dificuldade. Fácil  são 10 questões, Médio são 20 e Difícil são 40"));
       // addButton("Créditos", e -> showTextScreen("Template créditos"));
        addButton("Scoreboard", e -> showScoreboardScreen());
        addButton("Sair", e -> System.exit(0));
    }

    private void addButton(String text, ActionListener listener) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        add(button);
    }

    private void showCategoryScreen() {
        frame.setContentPane(new CategoryPanel(frame));
        frame.revalidate();
    }

    private void showTextScreen(String text) {
        frame.setContentPane(new TextPanel(frame, text));
        frame.revalidate();
    }

    private void showScoreboardScreen() {
        frame.setContentPane(new ScoreboardPanel(frame));
        frame.revalidate();
    }
}

class TextPanel extends JPanel {

    private JFrame frame;
    private String text;

    public TextPanel(JFrame frame, String text) {
        this.frame = frame;
        this.text = text;
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea(text);
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JButton backButton = new JButton("Voltar");
        backButton.addActionListener(e -> {
            frame.setContentPane(new MainMenuPanel(frame));
            frame.revalidate();
        });
        add(backButton, BorderLayout.SOUTH);
    }
}

class ScoreboardPanel extends JPanel {

    private JFrame frame;

    public ScoreboardPanel(JFrame frame) {
        this.frame = frame;
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea(carregarScoreboard());
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JButton backButton = new JButton("Voltar");
        backButton.addActionListener(e -> {
            frame.setContentPane(new MainMenuPanel(frame));
            frame.revalidate();
        });
        add(backButton, BorderLayout.SOUTH);
    }

    private String carregarScoreboard() {
        try {
            FileReader reader = new FileReader("scoreboard.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            StringBuilder scoreboard = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                scoreboard.append(line).append("\n");
            }

            bufferedReader.close();
            reader.close();

            if (scoreboard.length() == 0) {
                return "Ainda não foi salva nenhuma pontuação. Seja o primeiro!";
            } else {
                return scoreboard.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Erro ao carregar pontuações", "Erro", JOptionPane.ERROR_MESSAGE);
            return "";
        }
    }
}

class CategoryPanel extends JPanel {

    private JFrame frame;

    public CategoryPanel(JFrame frame) {
        this.frame = frame;
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(4, 1));

        addButton("Perguntas sobre IA", e -> showDifficultyScreen("IA"));
        addButton("Perguntas sobre Segurança da Informação", e -> showDifficultyScreen("Segurança"));
        addButton("Perguntas Mistas", e -> showDifficultyScreen("Mistas"));
        addButton("Voltar", e -> {
            frame.setContentPane(new MainMenuPanel(frame));
            frame.revalidate();
        });
    }

    private void addButton(String text, ActionListener listener) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        add(button);
    }

    private void showDifficultyScreen(String category) {
        frame.setContentPane(new DifficultyPanel(frame, category));
        frame.revalidate();
    }
}

class DifficultyPanel extends JPanel {

    private JFrame frame;
    private String category;

    public DifficultyPanel(JFrame frame, String category) {
        this.frame = frame;
        this.category = category;
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(4, 1));

        addButton("Fácil", e -> startGame("Fácil", 10));
        addButton("Médio", e -> startGame("Médio", 20));
        addButton("Difícil", e -> startGame("Difícil", 40));
        addButton("Voltar", e -> {
            frame.setContentPane(new CategoryPanel(frame));
            frame.revalidate();
        });
    }

    private void addButton(String text, ActionListener listener) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        add(button);
    }

    private void startGame(String difficulty, int numberOfQuestions) {
        // Escolher a lista de perguntas com base na categoria
        List<?> perguntas = escolherListaDePerguntas(category);

        // Limitar o número de perguntas com base na dificuldade
        List<?> perguntasSelecionadas = escolherPerguntasAleatorias(perguntas, numberOfQuestions);

        // Iniciar o jogo
        GamePanel gamePanel = criarGamePanel(perguntasSelecionadas, difficulty);
        if (gamePanel != null) {
            frame.setContentPane(gamePanel);
            frame.revalidate();
            gamePanel.iniciarJogo();
        }
    }

    private List<?> escolherListaDePerguntas(String category) {
        if (category.equals("IA")) {
            return PerguntaIA.criarPerguntasIA();
        } else if (category.equals("Segurança")) {
            return PerguntaSeguranca.criarPerguntasSeguranca();
        } else if (category.equals("Mistas")) {
            return PerguntaMista.criarPerguntasMistas();
        } else {
            return Collections.emptyList();
        }
    }

    private List<?> escolherPerguntasAleatorias(List<?> perguntas, int numberOfQuestions) {
        // Embaralhar as perguntas
        Collections.shuffle(perguntas);

        // Selecionar o número desejado de perguntas
        return perguntas.subList(0, Math.min(numberOfQuestions, perguntas.size()));
    }

    private GamePanel criarGamePanel(List<?> perguntas, String difficulty) {
        if (category.equals("IA")) {
            return new GamePanel(frame, perguntas, difficulty);
        } else if (category.equals("Segurança")) {
            return new GamePanel(frame, perguntas, difficulty);
        } else if (category.equals("Mistas")) {
            return new GamePanel(frame, perguntas, difficulty);
        } else {
            return null;
        }
    }
}



