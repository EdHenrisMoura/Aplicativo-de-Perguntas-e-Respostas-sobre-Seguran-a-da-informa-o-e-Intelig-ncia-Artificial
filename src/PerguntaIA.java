
import java.util.ArrayList;
import java.util.List;

public class PerguntaIA {
    private String pergunta;
    private String[] alternativas;
    private int[] respostasCorretas; // Alterado para int[]

    public PerguntaIA(String pergunta, String[] alternativas, int[] respostasCorretas) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.respostasCorretas = respostasCorretas;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public int[] getRespostasCorretas() {
        return respostasCorretas;
    }

    public static List<PerguntaIA> criarPerguntasIA() {
        List<PerguntaIA> perguntas = new ArrayList<>();

        perguntas.add(new PerguntaIA(
                "O aprendizado de máquina é uma subárea da inteligência artificial em que os algoritmos aprendem com os dados. Qual destes não é um dos três principais tipos de aprendizado de máquina?",
                new String[]{"Aprendizado supervisionado", "Aprendizado não supervisionado", "Aprendizado por reforço", "Aprendizado de memória"},
                new int[]{3} // Resposta correta é a opção D (índice 3)
        ));

        perguntas.add(new PerguntaIA(
                "Processamento de Linguagem Natural (PLN) é uma área da inteligência artificial que lida com a interação entre computadores e linguagem humana. Qual dos seguintes não é um exemplo de aplicação de PLN?",
                new String[]{"Tradução automática", "Reconhecimento de fala", "Classificação de imagens", "Chatbots"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaIA(
                "Clustering é uma técnica de aprendizado de máquina usada para agrupar dados em grupos semelhantes. Qual é o objetivo principal de um algoritmo de clustering?",
                new String[]{"Prever valores numéricos", "Classificar dados em grupos semelhantes", "Encontrar a melhor rota em um mapa", "Recomendar produtos para compradores online"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "O que é um 'algoritmo genético' no contexto de Inteligência Artificial?",
                new String[]{"Um programa de IA que simula a evolução das espécies.", "Um algoritmo de ordenação utilizado para organizar dados em ordem alfabética.", "Um algoritmo que gera números aleatórios para treinar modelos de IA.", "Um método de otimização inspirado no processo de seleção natural."},
                new int[]{3} // Resposta correta é a opção D (índice 3)
        ));

        perguntas.add(new PerguntaIA(
                "Redes neurais recorrentes (RNN) são usadas para processar sequências de dados, como texto e áudio. Qual técnica de aprendizado de máquina é usada para fazer previsões em séries temporais?",
                new String[]{"Redes neurais convolucionais (CNN)", "Árvores de decisão", "Redes neurais recorrentes (RNN)", "Regressão linear"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaIA(
                "Q-Learning, A3C (Asynchronous Advantage Actor-Critic) e DDPG (Deep Deterministic Policy Gradient) são exemplos de algoritmos de aprendizado por reforço. Qual dos seguintes não é um exemplo de um algoritmo de aprendizado por reforço?",
                new String[]{"Q-Learning", "Regressão logística", "A3C (Asynchronous Advantage Actor-Critic)", "DDPG (Deep Deterministic Policy Gradient)"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "Em machine learning, 'overfitting' (sobreajuste) ocorre quando um modelo se ajusta muito bem aos dados de treinamento, mas não generaliza bem para novos dados. O que é 'overfitting'?",
                new String[]{"Um modelo que não se ajusta bem aos dados de treinamento.", "Um modelo que se ajusta bem aos dados de treinamento, mas não generaliza bem para novos dados.", "Um modelo que generaliza bem para novos dados, mas não se ajusta bem aos dados de treinamento.", "Um tipo de algoritmo de aprendizado não supervisionado."},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "Um 'algoritmo de árvore de decisão' é frequentemente usado em machine learning. Este algoritmo cria uma estrutura em forma de árvore de regras de decisão. Qual é o objetivo principal de um algoritmo de árvore de decisão?",
                new String[]{"Um algoritmo de aprendizado profundo para imagens.", "Um algoritmo de clustering não supervisionado.", "Um algoritmo usado para prever valores contínuos.", "Um algoritmo usado para classificação e regressão que cria uma estrutura em forma de árvore de regras de decisão."},
                new int[]{3} // Resposta correta é a opção D (índice 3)
        ));

        perguntas.add(new PerguntaIA(
                "Visão computacional é um campo da inteligência artificial que se concentra no processamento de imagens e vídeos. O que é 'visão computacional'?",
                new String[]{"Uma técnica para tradução automática de idiomas.", "Um ramo da inteligência artificial que se concentra no processamento de imagens e vídeos.", "Uma técnica para análise de dados financeiros.", "Uma técnica para previsão do tempo."},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "Aprendizado profundo (deep learning) envolve a criação de modelos de aprendizado de máquina com muitas camadas para aumentar a complexidade. Qual é o objetivo principal do aprendizado profundo?",
                new String[]{"Criar modelos de aprendizado de máquina com muitas camadas para aumentar a complexidade.", "Treinar modelos que aprendem profundamente sobre um único tópico.", "Automatizar tarefas repetitivas em um ambiente de trabalho.", "Simular o funcionamento do cérebro humano em detalhes extremos."},
                new int[]{0} // Resposta correta é a opção A (índice 0)
        ));

        perguntas.add(new PerguntaIA(
                "Redes neurais artificiais são modelos computacionais inspirados na estrutura do cérebro humano. O que as diferencia é:",
                new String[]{"Uso exclusivo de hardware personalizado", "Número de camadas ocultas", "Funções de ativação", "Capacidade de reconhecimento facial"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaIA(
                "Em aprendizado supervisionado, o que é o conjunto de dados de teste?",
                new String[]{"Dados usados para treinar o modelo", "Dados usados para avaliar o desempenho do modelo", "Dados que não têm rótulos", "Dados usados para validação cruzada"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "Qual é o objetivo principal da técnica de 'reconhecimento de padrões' em IA?",
                new String[]{"Identificar tendências em séries temporais", "Encontrar objetos semelhantes em imagens", "Otimizar algoritmos de aprendizado profundo", "Fazer previsões econômicas"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "O que é um 'modelo de linguagem' em processamento de linguagem natural (PLN)?",
                new String[]{"Um modelo que traduz automaticamente entre várias línguas", "Um modelo que analisa a estrutura gramatical de uma frase", "Um modelo que entende linguagem de programação", "Um modelo que prevê a próxima palavra em uma sequência de palavras"},
                new int[]{3} // Resposta correta é a opção D (índice 3)
        ));

        perguntas.add(new PerguntaIA(
                "Qual é a principal desvantagem do 'aprendizado não supervisionado' em comparação com o 'aprendizado supervisionado'?",
                new String[]{"Requer uma quantidade maior de dados rotulados", "É mais difícil de implementar", "Gera modelos de IA menos precisos", "Não é aplicável a nenhum domínio"},
                new int[]{0} // Resposta correta é a opção A (índice 0)
        ));

        perguntas.add(new PerguntaIA(
                "Em IA, o que é 'visão computacional'?",
                new String[]{"Um campo de pesquisa que se concentra na construção de computadores com 'visão'", "Um termo usado para descrever a análise de dados financeiros", "Um método para tradução automática de idiomas", "Uma técnica para jogos de computador"},
                new int[]{0} // Resposta correta é a opção A (índice 0)
        ));

        perguntas.add(new PerguntaIA(
                "A 'aprendizagem por reforço' é um tipo de aprendizado de máquina em que os modelos aprendem com base em:",
                new String[]{"Dados rotulados", "A interação com o ambiente e a recompensa ou penalização", "A otimização de parâmetros", "Cálculos matemáticos complexos"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "O que é 'transferência de aprendizado' (transfer learning) em IA e como ela é aplicada em diversos domínios?",
                new String[]{"Uma técnica que envolve transferir fisicamente modelos de IA de um dispositivo para outro.", "Um método que usa dados de treinamento de um domínio para melhorar o desempenho em um domínio relacionado.", "Um processo de transferência de conhecimento humano para um modelo de IA.", "Uma técnica que permite a IA aprender diretamente com um único exemplo."},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "O que é 'aprendizado por transferência' em aprendizado de máquina?",
                new String[]{"A transferência de dinheiro entre contas bancárias", "A transferência de conhecimento de um domínio de origem para um domínio de destino", "A transferência de arquivos de um computador para outro", "A transferência de energia entre máquinas"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "Em IA, o que é um 'agente' em um ambiente?",
                new String[]{"Um ser humano que interage com um computador", "Um programa de computador que realiza tarefas específicas", "Um programa que executa uma única ação", "Um sistema que percebe seu ambiente e toma decisões para alcançar objetivos"},
                new int[]{3} // Resposta correta é a opção D (índice 3)
        ));


        perguntas.add(new PerguntaIA(
                "O que é um 'modelo GAN' (Rede Generativa Adversarial) em IA?",
                new String[]{"Um modelo de IA que gera automaticamente nomes de empresas", "Um modelo de IA que cria de forma autônoma conteúdo visual, como imagens e vídeos", "Um modelo que realiza cálculos matemáticos avançados", "Um modelo de IA que cria automaticamente código de programação"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "Qual é o objetivo principal da 'mineração de dados' em IA?",
                new String[]{"Encontrar informações confidenciais em documentos", "Descobrir padrões e informações úteis em grandes conjuntos de dados", "Extrair metais preciosos do solo", "Coletar informações secretas do governo"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "Em IA, o que é um 'agente de chat'?",
                new String[]{"Um programa de IA que joga jogos de tabuleiro online", "Um programa de IA que simula conversas com seres humanos", "Um dispositivo de hardware usado para análise de dados", "Um sistema de pagamento online"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "O que é a 'lei de Moore' no contexto da evolução da tecnologia?",
                new String[]{"Uma lei que proíbe a evolução da tecnologia", "Uma lei que prevê o aumento exponencial da capacidade de processamento de computadores", "Uma lei que regula a fabricação de microchips", "Uma lei que impede a inovação tecnológica"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "O que é 'aprendizado por imitação' em IA?",
                new String[]{"Aprendizado baseado em exemplos, onde um agente imita comportamentos observados em dados de treinamento", "Aprendizado por tentativa e erro", "Aprendizado por memorização de dados", "Aprendizado baseado em recompensas"},
                new int[]{0} // Resposta correta é a opção A (índice 0)
        ));

        perguntas.add(new PerguntaIA(
                "Qual é a principal preocupação ética na IA relacionada ao viés de dados?",
                new String[]{"O uso inadequado de modelos de IA", "O impacto na privacidade das pessoas", "A discriminação injusta de grupos de pessoas devido a dados enviesados", "A criação de superinteligências maliciosas"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaIA(
                "O que é uma 'rede neural convolucional' (CNN) em IA?",
                new String[]{"Uma rede de neurônios em forma de círculo", "Uma rede que processa informações em sequência", "Uma rede projetada para processar dados de imagens", "Uma rede que se assemelha a uma teia de aranha"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaIA(
                "Qual é o conceito de 'superação' (singularity) em IA?",
                new String[]{"O momento em que todas as máquinas se tornam inúteis", "O ponto em que a inteligência artificial supera a inteligência humana", "O término do desenvolvimento de tecnologia", "O ponto em que todas as previsões são esquecidas"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "O que é 'aprendizado federado' em IA?",
                new String[]{"Um método de treinamento de modelos de IA em computadores individuais", "Um método de aprendizado que requer servidores centrais para treinamento", "Um método de IA que não requer treinamento", "Um método para trocar dados entre nações"},
                new int[]{0} // Resposta correta é a opção A (índice 0)
        ));

        perguntas.add(new PerguntaIA(
                "O que é um 'chatbot' em IA?",
                new String[]{"Um robô de limpeza", "Um programa de computador que simula conversas humanas", "Um programa de IA que joga xadrez", "Um dispositivo de reconhecimento de voz"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "O que é um 'agente de IA autônomo'?",
                new String[]{"Um programa de computador que requer intervenção humana constante", "Um programa de IA que opera sem intervenção humana direta", "Um assistente virtual que imita o comportamento humano", "Um robô que só funciona em ambientes controlados"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaIA(
                "Quais são os principais desafios éticos relacionados ao desenvolvimento e uso de sistemas de IA, e como a comunidade de IA está abordando essas questões?",
                new String[]{"Desafios técnicos relacionados à precisão dos modelos de IA.", "Desafios financeiros relacionados ao custo de desenvolvimento de IA.", "Desafios éticos relacionados à privacidade, preconceito e responsabilidade.", "Desafios legais relacionados a direitos autorais de algoritmos de IA."},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaIA(
                "O que é um 'motor de inferência' em sistemas de IA?",
                new String[]{"Uma parte essencial do cérebro humano responsável pela tomada de decisões", "Um mecanismo que processa comandos de voz", "Um componente que aplica regras lógicas para chegar a conclusões com base em dados disponíveis", "Um dispositivo que realiza operações matemáticas avançadas"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaIA(
                "Em IA, o que é 'aprendizado não supervisionado'?",
                new String[]{"Um método de treinamento em que um supervisor humano fornece feedback constante", "Um tipo de aprendizado que não envolve a interação com o ambiente", "Um método que usa dados não rotulados para encontrar padrões e estruturas nos dados", "Um método exclusivamente usado em robótica"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaIA(
                "O que é um 'turing test' (teste de Turing) em IA?",
                new String[]{"Um teste de velocidade para medir o desempenho de computadores", "Um teste para avaliar a capacidade de um robô de realizar tarefas físicas", "Um teste projetado para verificar se uma máquina pode exibir comportamento indistinguível do de um ser humano", "Um teste para medir a potência do processamento de texto"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaIA(
                "Em IA, o que é 'inteligência artificial fraca' (IA fraca)?",
                new String[]{"Uma forma de IA que é mais inteligente do que os seres humanos", "Uma forma de IA que pode superar desafios em qualquer domínio", "Uma forma de IA que lida com tarefas específicas e não exibe inteligência geral", "Uma forma de IA que não é útil em nenhum cenário"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaIA(
                "O que é 'processamento de linguagem natural' (PLN) em IA?",
                new String[]{"Um método de criptografia de mensagens de texto", "Uma técnica para tradução automática de idiomas", "Um método de reconhecimento de fala", "Um campo que se concentra no processamento e compreensão da linguagem humana"},
                new int[]{3} // Resposta correta é a opção D (índice 3)
        ));

        perguntas.add(new PerguntaIA(
                "Qual é o principal objetivo do 'aprendizado profundo por reforço'?",
                new String[]{"Treinar modelos de IA para realizar tarefas de forma independente", "Ensinar algoritmos a realizar cálculos matemáticos complexos", "Otimizar a capacidade de reconhecimento de imagens", "Implementar recompensas em jogos de vídeo"},
                new int[]{0} // Resposta correta é a opção A (índice 0)
        ));

        perguntas.add(new PerguntaIA(
                "O que é um 'algoritmo de busca' em IA?",
                new String[]{"Um programa de computador que procura informações confidenciais na web", "Uma técnica para criar senhas seguras", "Um método que encontra soluções em um espaço de possibilidades", "Um algoritmo de processamento de texto"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaIA(
                "Em IA, o que é a 'robótica autônoma'?",
                new String[]{"Um campo que se concentra apenas na criação de robôs humanóides", "Um campo que visa desenvolver robôs que podem operar de forma independente em ambientes variados", "Um método de automação de processos de escritório", "Uma técnica para melhorar a comunicação entre robôs"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        return perguntas;
    }
}