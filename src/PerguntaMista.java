
import java.util.ArrayList;
import java.util.List;

public class PerguntaMista {
    private String pergunta;
    private String[] alternativas;
    private int[] respostasCorretas; // Alterado para int[]

    public PerguntaMista(String pergunta, String[] alternativas, int[] respostasCorretas) {
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

    public static List<PerguntaMista> criarPerguntasMistas() {
        List<PerguntaMista> perguntas = new ArrayList<>();

        perguntas.add(new PerguntaMista(
                "A autenticação de dois fatores (2FA) é um método de segurança que adiciona uma camada adicional de autenticação além da senha tradicional. Como funciona, no caso, qual é essa camada adicional de segurança?",
                new String[]{"Usuário e senha únicos", "Verificação por SMS", "Senha longa e complexa", "Firewall de última geração"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaMista(
                "A engenharia social é uma abordagem que explora a manipulação psicológica para obter informações confidenciais ou acesso não autorizado. Mas como isso funciona?",
                new String[]{"Um método para criptografar dados", "Uma técnica para manipular pessoas e obter informações confidenciais", "Um tipo de firewall", "Um protocolo de segurança de rede"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaMista(
                "Um ataque de 'phishing' é um tipo de ataque cibernético que envolve enganar as vítimas para que revelem informações confidenciais. Mas como isso é realizado?",
                new String[]{"Fazendo um ataque de negação de serviço (DDoS)", "Fazendo Uma técnica de engenharia social para obter senhas", "Fazendo Um método para criptografar e-mails", "Fazendo Uma técnica de criptografia de dados"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaMista(
                "Qual das seguintes opções é uma prática recomendada para criar senhas seguras?",
                new String[]{"Usar a mesma senha para todas as contas", "Usar senhas curtas e simples", "Usar senhas complexas com letras, números e caracteres especiais", "Compartilhar senhas com colegas de trabalho"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaMista(
                "O que é um firewall em segurança de rede?",
                new String[]{"Um dispositivo para proteger contra sobrecarga de tráfego na rede", "Uma técnica para ocultar endereços IP", "Um software usado para monitorar o tráfego de rede e bloquear atividades suspeitas", "Um protocolo de criptografia de dados"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaMista(
                "Qual das seguintes opções é uma medida de segurança para proteger um computador contra malware?",
                new String[]{"Desativar todas as atualizações de software", "Instalar um antivírus atualizado", "Compartilhar regularmente arquivos desconhecidos", "Usar senhas fracas"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaMista(
                "O que é Ransomware?",
                new String[]{"Um ataque que rouba informações pessoais", "Um ataque que sequestra arquivos e exige um resgate para recuperá-los", "Um ataque que sobrecarrega um servidor de rede", "Um ataque que danifica fisicamente o hardware de um computador"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaMista(
                "A criptografia é usada para proteger dados sensíveis durante a transmissão e armazenamento mas exatamente o que é criptografia?",
                new String[]{"Um tipo de malware", "Um dispositivo de firewall", "Um processo de codificação de dados para torná-los ilegíveis sem a chave correta", "Um protocolo de autenticação de rede"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaMista(
                "Qual é a principal ameaça à segurança da informação que envolve o uso não autorizado de senhas roubadas ou vazadas?",
                new String[]{"Ataque de phishing", "Ataque de negação de serviço (DDoS)", "Ataque de força bruta", "Ataque de engenharia social"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaMista(
                "O que é um 'patch' de segurança?",
                new String[]{"Um dispositivo de proteção de rede", "Um tipo de senha complexa", "Uma atualização de software projetada para corrigir vulnerabilidades de segurança", "Uma técnica de criptografia de e-mail"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

perguntas.add(new PerguntaMista(
        "O que é um ataque de força bruta?",
        new String[]{"Um ataque que explora vulnerabilidades no software", "Um ataque que tenta todas as combinações possíveis de senhas até encontrar a correta", "Um ataque que sequestra arquivos e exige um resgate", "Um ataque que envolve a engenharia social"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é um certificado SSL e qual é sua função na segurança de informações?",
        new String[]{"Um software de criptografia de e-mails", "Um tipo de ataque de negação de serviço (DDoS)", "Um protocolo de segurança de rede", "Um protocolo de criptografia usado para proteger a comunicação na internet"},
        new int[]{3} // Resposta correta é a opção D (índice 3)
));

perguntas.add(new PerguntaMista(
        "O que é a autenticação de dois fatores (2FA) e por que é importante?",
        new String[]{"Um método de criptografia de dados", "Um protocolo de autenticação de rede", "Um processo de validação que requer duas formas diferentes de identificação para acessar uma conta", "Um tipo de ataque cibernético"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é um ataque de injeção de SQL?",
        new String[]{"Um ataque que sequestra arquivos e exige um resgate", "Um método para criptografar dados", "Uma técnica de engenharia social para obter senhas", "Um ataque que explora vulnerabilidades em aplicativos da web"},
        new int[]{3} // Resposta correta é a opção D (índice 3)
));

perguntas.add(new PerguntaMista(
        "O que é um vírus de computador e como ele se propaga?",
        new String[]{"Um tipo de ataque de negação de serviço (DDoS)", "Um programa malicioso que se anexa a arquivos e se espalha quando esses arquivos são compartilhados", "Uma técnica de criptografia de dados", "Um protocolo de segurança de rede"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "Qual é a importância de manter o software e os sistemas operacionais atualizados?",
        new String[]{"Para aumentar o desempenho do computador", "Para economizar dinheiro em licenças de software", "Para corrigir vulnerabilidades de segurança e bugs", "Para garantir a compatibilidade com dispositivos mais antigos"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é um ataque de negação de serviço (DDoS) e como ele funciona?",
        new String[]{"Um ataque que sobrecarrega um servidor de rede", "Uma técnica para ocultar endereços IP", "Um protocolo de autenticação de rede", "Um método para criptografar e-mails"},
        new int[]{0} // Resposta correta é a opção A (índice 0)
));

perguntas.add(new PerguntaMista(
        "O que é engenharia reversa e como ela está relacionada à segurança da informação?",
        new String[]{"Um ataque que rouba informações pessoais", "Um processo de desmontar e analisar um software ou hardware para entender seu funcionamento interno", "Um ataque que explora vulnerabilidades no software", "Um dispositivo para proteger contra sobrecarga de tráfego na rede"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "Qual é a diferença entre um firewall de hardware e um firewall de software?",
        new String[]{"Um firewall de hardware é um dispositivo físico, enquanto um firewall de software é um programa de computador", "Ambos são a mesma coisa e podem ser usados indistintamente", "Um firewall de hardware é mais vulnerável a ataques cibernéticos", "Um firewall de software é mais caro que um firewall de hardware"},
        new int[]{0} // Resposta correta é a opção A (índice 0)
));

perguntas.add(new PerguntaMista(
        "O que é criptografia de ponta a ponta e em que contexto é comumente usada?",
        new String[]{"Um protocolo de criptografia de dados", "Uma técnica de segurança usada em dispositivos móveis", "Um método de codificação de dados que torna a comunicação ilegível para terceiros, apenas as partes envolvidas podem decifrar", "Uma técnica para ocultar endereços IP"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));


perguntas.add(new PerguntaMista(
        "O que é um ataque de spear phishing?",
        new String[]{"Um ataque que rouba informações pessoais", "Um tipo de ataque de força bruta", "Um ataque de phishing direcionado a uma pessoa ou organização específica, geralmente usando informações personalizadas", "Um ataque que envolve a engenharia social"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é a autenticação de dois fatores (2FA) baseada em token?",
        new String[]{"Um protocolo de autenticação de rede", "Um método de autenticação que envolve o uso de um dispositivo físico, como um token, para gerar códigos temporários", "Um tipo de ataque cibernético", "Um protocolo de criptografia usado para proteger a comunicação na internet"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é a GDPR (Regulamento Geral de Proteção de Dados) e qual é sua importância para a segurança da informação?",
        new String[]{"Um protocolo de segurança de rede", "Uma lei europeia que regula a proteção de dados pessoais e a privacidade dos cidadãos", "Um dispositivo para proteger contra sobrecarga de tráfego na rede", "Um protocolo de autenticação de rede"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é uma VPN (Rede Virtual Privada) e como ela ajuda na segurança da informação?",
        new String[]{"Uma técnica de segurança usada em dispositivos móveis", "Um protocolo de criptografia de dados", "Uma conexão segura que permite o acesso a redes privadas pela internet, protegendo a comunicação de terceiros", "Um ataque de negação de serviço (DDoS)"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é engenharia social reversa?",
        new String[]{"Um método para criptografar dados", "Um processo de manipulação psicológica que envolve convencer uma pessoa a fazer algo contra sua vontade", "Um ataque que explora vulnerabilidades no software", "Um tipo de ataque de phishing"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "Qual é a importância de fazer backup regularmente de dados e sistemas?",
        new String[]{"Para economizar espaço de armazenamento", "Para evitar atualizações de software", "Para proteger contra perda de dados devido a falhas de hardware, ataques de malware ou desastres", "Para aumentar a velocidade da conexão de rede"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é um ataque de 'man-in-the-middle' e como ele funciona?",
        new String[]{"Um ataque que sobrecarrega um servidor de rede", "Um ataque que sequestra arquivos e exige um resgate", "Um ataque que intercepta a comunicação entre duas partes, sem que elas saibam", "Um ataque que envolve a engenharia social"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é um 'honeypot' e qual é o seu propósito na segurança da informação?",
        new String[]{"Um ataque que rouba informações pessoais", "Uma técnica de segurança usada em dispositivos móveis", "Um sistema de armadilha projetado para atrair hackers e monitorar suas atividades", "Um protocolo de segurança de rede"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é autenticação de biometria e como ela é usada na segurança da informação?",
        new String[]{"Um método de autenticação que envolve o uso de características físicas únicas, como impressões digitais ou reconhecimento facial", "Um dispositivo para proteger contra sobrecarga de tráfego na rede", "Um protocolo de autenticação de rede", "Um processo de criptografia de dados"},
        new int[]{0} // Resposta correta é a opção A (índice 0)
));

perguntas.add(new PerguntaMista(
        "O que é a política de privacidade de dados e por que é importante?",
        new String[]{"Uma técnica para ocultar endereços IP", "Um tipo de ataque cibernético", "Um conjunto de regras que define como os dados pessoais dos usuários são coletados, armazenados e usados por uma organização", "Um ataque que explora vulnerabilidades no software"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é a política de privacidade de dados e por que é importante?",
        new String[]{"Uma técnica para ocultar endereços IP", "Um tipo de ataque cibernético", "Um conjunto de regras que define como os dados pessoais dos usuários são coletados, armazenados e usados por uma organização", "Um ataque que explora vulnerabilidades no software"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é criptomoeda e como a segurança da informação está relacionada ao seu uso?",
        new String[]{"Uma técnica para ocultar endereços IP", "Uma forma de dinheiro digital que utiliza criptografia para garantir transações seguras", "Um tipo de ataque cibernético", "Uma técnica de criptografia de e-mail"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é autenticação de dois fatores (2FA) baseada em biometria e como ela funciona?",
        new String[]{"Um protocolo de segurança de rede", "Um método de autenticação que utiliza características físicas únicas, como impressões digitais ou reconhecimento facial", "Um ataque de negação de serviço (DDoS)", "Um protocolo de autenticação de rede"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é um ataque de 'zero-day' e por que é considerado uma ameaça grave à segurança da informação?",
        new String[]{"Um tipo de ataque de força bruta", "Um ataque que explora vulnerabilidades conhecidas em sistemas e aplicativos", "Um ataque que ocorre em uma data específica", "Um ataque que explora uma vulnerabilidade desconhecida que ainda não foi corrigida pelos desenvolvedores"},
        new int[]{3} // Resposta correta é a opção D (índice 3)
));

perguntas.add(new PerguntaMista(
        "O que é criptografia de disco e como ela ajuda a proteger os dados armazenados em dispositivos?",
        new String[]{"Um método para criptografar e-mails", "Um processo de codificação de todo o conteúdo de um disco rígido ou dispositivo de armazenamento", "Um protocolo de segurança de rede", "Um ataque que sequestra arquivos e exige um resgate"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é um 'firewall de inspeção profunda de pacotes' e como ele difere de um firewall tradicional?",
        new String[]{"Um dispositivo para proteger contra sobrecarga de tráfego na rede", "Uma técnica para ocultar endereços IP", "Um dispositivo de segurança que analisa o conteúdo dos pacotes de dados em busca de ameaças", "Um protocolo de autenticação de rede"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é a autenticação de dois fatores (2FA) por meio de um aplicativo móvel e como ela funciona?",
        new String[]{"Um tipo de ataque cibernético", "Um método de autenticação que utiliza um aplicativo móvel para gerar códigos temporários", "Uma técnica de segurança usada em dispositivos móveis", "Um protocolo de criptografia usado para proteger a comunicação na internet"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é 'engenharia social baseada em pretextos' e como funciona?",
        new String[]{"Um ataque que explora vulnerabilidades no software", "Um método para criptografar dados", "Uma técnica de engenharia social que envolve a criação de pretextos ou histórias fictícias para obter informações confidenciais", "Um ataque de phishing"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é um 'sandbox' de segurança e qual é seu papel na proteção contra malware?",
        new String[]{"Um protocolo de segurança de rede", "Uma técnica de criptografia de dados", "Um ambiente isolado e seguro em que os programas podem ser executados sem afetar o sistema principal", "Um dispositivo para proteger contra sobrecarga de tráfego na rede"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é um 'WAF' (Web Application Firewall) e como ele ajuda a proteger aplicativos da web?",
        new String[]{"Uma técnica para ocultar endereços IP", "Um ataque de negação de serviço (DDoS)", "Um dispositivo de segurança que monitora e protege aplicativos da web contra ameaças e ataques cibernéticos", "Um protocolo de autenticação de rede"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é um 'certificado digital' e como ele é usado na autenticação e na segurança de transações online?",
        new String[]{"Um método de criptografia de e-mail", "Um tipo de ataque cibernético", "Um arquivo digital que contém informações de identificação e chave pública, usado para autenticar identidades e proteger transações online", "Um protocolo de segurança de rede"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O aprendizado de máquina é uma subárea da inteligência artificial em que os algoritmos aprendem com os dados. Qual destes não é um dos três principais tipos de aprendizado de máquina?",
        new String[]{"Aprendizado supervisionado", "Aprendizado não supervisionado", "Aprendizado por reforço", "Aprendizado de memória"},
        new int[]{3} // Resposta correta é a opção D (índice 3)
));

perguntas.add(new PerguntaMista(
        "Processamento de Linguagem Natural (PLN) é uma área da inteligência artificial que lida com a interação entre computadores e linguagem humana. Qual dos seguintes não é um exemplo de aplicação de PLN?",
        new String[]{"Tradução automática", "Reconhecimento de fala", "Classificação de imagens", "Chatbots"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "Clustering é uma técnica de aprendizado de máquina usada para agrupar dados em grupos semelhantes. Qual é o objetivo principal de um algoritmo de clustering?",
        new String[]{"Prever valores numéricos", "Classificar dados em grupos semelhantes", "Encontrar a melhor rota em um mapa", "Recomendar produtos para compradores online"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é um 'algoritmo genético' no contexto de Inteligência Artificial?",
        new String[]{"Um programa de IA que simula a evolução das espécies.", "Um algoritmo de ordenação utilizado para organizar dados em ordem alfabética.", "Um algoritmo que gera números aleatórios para treinar modelos de IA.", "Um método de otimização inspirado no processo de seleção natural."},
        new int[]{3} // Resposta correta é a opção D (índice 3)
));

perguntas.add(new PerguntaMista(
        "Redes neurais recorrentes (RNN) são usadas para processar sequências de dados, como texto e áudio. Qual técnica de aprendizado de máquina é usada para fazer previsões em séries temporais?",
        new String[]{"Redes neurais convolucionais (CNN)", "Árvores de decisão", "Redes neurais recorrentes (RNN)", "Regressão linear"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "Q-Learning, A3C (Asynchronous Advantage Actor-Critic) e DDPG (Deep Deterministic Policy Gradient) são exemplos de algoritmos de aprendizado por reforço. Qual dos seguintes não é um exemplo de um algoritmo de aprendizado por reforço?",
        new String[]{"Q-Learning", "Regressão logística", "A3C (Asynchronous Advantage Actor-Critic)", "DDPG (Deep Deterministic Policy Gradient)"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "Em machine learning, 'overfitting' (sobreajuste) ocorre quando um modelo se ajusta muito bem aos dados de treinamento, mas não generaliza bem para novos dados. O que é 'overfitting'?",
        new String[]{"Um modelo que não se ajusta bem aos dados de treinamento.", "Um modelo que se ajusta bem aos dados de treinamento, mas não generaliza bem para novos dados.", "Um modelo que generaliza bem para novos dados, mas não se ajusta bem aos dados de treinamento.", "Um tipo de algoritmo de aprendizado não supervisionado."},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "Um 'algoritmo de árvore de decisão' é frequentemente usado em machine learning. Este algoritmo cria uma estrutura em forma de árvore de regras de decisão. Qual é o objetivo principal de um algoritmo de árvore de decisão?",
        new String[]{"Um algoritmo de aprendizado profundo para imagens.", "Um algoritmo de clustering não supervisionado.", "Um algoritmo usado para prever valores contínuos.", "Um algoritmo usado para classificação e regressão que cria uma estrutura em forma de árvore de regras de decisão."},
        new int[]{3} // Resposta correta é a opção D (índice 3)
));

perguntas.add(new PerguntaMista(
        "Visão computacional é um campo da inteligência artificial que se concentra no processamento de imagens e vídeos. O que é 'visão computacional'?",
        new String[]{"Uma técnica para tradução automática de idiomas.", "Um ramo da inteligência artificial que se concentra no processamento de imagens e vídeos.", "Uma técnica para análise de dados financeiros.", "Uma técnica para previsão do tempo."},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "Aprendizado profundo (deep learning) envolve a criação de modelos de aprendizado de máquina com muitas camadas para aumentar a complexidade. Qual é o objetivo principal do aprendizado profundo?",
        new String[]{"Criar modelos de aprendizado de máquina com muitas camadas para aumentar a complexidade.", "Treinar modelos que aprendem profundamente sobre um único tópico.", "Automatizar tarefas repetitivas em um ambiente de trabalho.", "Simular o funcionamento do cérebro humano em detalhes extremos."},
        new int[]{0} // Resposta correta é a opção A (índice 0)
));

perguntas.add(new PerguntaMista(
        "Redes neurais artificiais são modelos computacionais inspirados na estrutura do cérebro humano. O que as diferencia é:",
        new String[]{"Uso exclusivo de hardware personalizado", "Número de camadas ocultas", "Funções de ativação", "Capacidade de reconhecimento facial"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "Em aprendizado supervisionado, o que é o conjunto de dados de teste?",
        new String[]{"Dados usados para treinar o modelo", "Dados usados para avaliar o desempenho do modelo", "Dados que não têm rótulos", "Dados usados para validação cruzada"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "Qual é o objetivo principal da técnica de 'reconhecimento de padrões' em IA?",
        new String[]{"Identificar tendências em séries temporais", "Encontrar objetos semelhantes em imagens", "Otimizar algoritmos de aprendizado profundo", "Fazer previsões econômicas"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é um 'modelo de linguagem' em processamento de linguagem natural (PLN)?",
        new String[]{"Um modelo que traduz automaticamente entre várias línguas", "Um modelo que analisa a estrutura gramatical de uma frase", "Um modelo que entende linguagem de programação", "Um modelo que prevê a próxima palavra em uma sequência de palavras"},
        new int[]{3} // Resposta correta é a opção D (índice 3)
));

perguntas.add(new PerguntaMista(
        "Qual é a principal desvantagem do 'aprendizado não supervisionado' em comparação com o 'aprendizado supervisionado'?",
        new String[]{"Requer uma quantidade maior de dados rotulados", "É mais difícil de implementar", "Gera modelos de IA menos precisos", "Não é aplicável a nenhum domínio"},
        new int[]{0} // Resposta correta é a opção A (índice 0)
));

perguntas.add(new PerguntaMista(
        "Em IA, o que é 'visão computacional'?",
        new String[]{"Um campo de pesquisa que se concentra na construção de computadores com 'visão'", "Um termo usado para descrever a análise de dados financeiros", "Um método para tradução automática de idiomas", "Uma técnica para jogos de computador"},
        new int[]{0} // Resposta correta é a opção A (índice 0)
));

perguntas.add(new PerguntaMista(
        "A 'aprendizagem por reforço' é um tipo de aprendizado de máquina em que os modelos aprendem com base em:",
        new String[]{"Dados rotulados", "A interação com o ambiente e a recompensa ou penalização", "A otimização de parâmetros", "Cálculos matemáticos complexos"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é 'transferência de aprendizado' (transfer learning) em IA e como ela é aplicada em diversos domínios?",
        new String[]{"Uma técnica que envolve transferir fisicamente modelos de IA de um dispositivo para outro.", "Um método que usa dados de treinamento de um domínio para melhorar o desempenho em um domínio relacionado.", "Um processo de transferência de conhecimento humano para um modelo de IA.", "Uma técnica que permite a IA aprender diretamente com um único exemplo."},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é 'aprendizado por transferência' em aprendizado de máquina?",
        new String[]{"A transferência de dinheiro entre contas bancárias", "A transferência de conhecimento de um domínio de origem para um domínio de destino", "A transferência de arquivos de um computador para outro", "A transferência de energia entre máquinas"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "Em IA, o que é um 'agente' em um ambiente?",
        new String[]{"Um ser humano que interage com um computador", "Um programa de computador que realiza tarefas específicas", "Um programa que executa uma única ação", "Um sistema que percebe seu ambiente e toma decisões para alcançar objetivos"},
        new int[]{3} // Resposta correta é a opção D (índice 3)
));


perguntas.add(new PerguntaMista(
        "O que é um 'modelo GAN' (Rede Generativa Adversarial) em IA?",
        new String[]{"Um modelo de IA que gera automaticamente nomes de empresas", "Um modelo de IA que cria de forma autônoma conteúdo visual, como imagens e vídeos", "Um modelo que realiza cálculos matemáticos avançados", "Um modelo de IA que cria automaticamente código de programação"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "Qual é o objetivo principal da 'mineração de dados' em IA?",
        new String[]{"Encontrar informações confidenciais em documentos", "Descobrir padrões e informações úteis em grandes conjuntos de dados", "Extrair metais preciosos do solo", "Coletar informações secretas do governo"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "Em IA, o que é um 'agente de chat'?",
        new String[]{"Um programa de IA que joga jogos de tabuleiro online", "Um programa de IA que simula conversas com seres humanos", "Um dispositivo de hardware usado para análise de dados", "Um sistema de pagamento online"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é a 'lei de Moore' no contexto da evolução da tecnologia?",
        new String[]{"Uma lei que proíbe a evolução da tecnologia", "Uma lei que prevê o aumento exponencial da capacidade de processamento de computadores", "Uma lei que regula a fabricação de microchips", "Uma lei que impede a inovação tecnológica"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é 'aprendizado por imitação' em IA?",
        new String[]{"Aprendizado baseado em exemplos, onde um agente imita comportamentos observados em dados de treinamento", "Aprendizado por tentativa e erro", "Aprendizado por memorização de dados", "Aprendizado baseado em recompensas"},
        new int[]{0} // Resposta correta é a opção A (índice 0)
));

perguntas.add(new PerguntaMista(
        "Qual é a principal preocupação ética na IA relacionada ao viés de dados?",
        new String[]{"O uso inadequado de modelos de IA", "O impacto na privacidade das pessoas", "A discriminação injusta de grupos de pessoas devido a dados enviesados", "A criação de superinteligências maliciosas"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é uma 'rede neural convolucional' (CNN) em IA?",
        new String[]{"Uma rede de neurônios em forma de círculo", "Uma rede que processa informações em sequência", "Uma rede projetada para processar dados de imagens", "Uma rede que se assemelha a uma teia de aranha"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "Qual é o conceito de 'superação' (singularity) em IA?",
        new String[]{"O momento em que todas as máquinas se tornam inúteis", "O ponto em que a inteligência artificial supera a inteligência humana", "O término do desenvolvimento de tecnologia", "O ponto em que todas as previsões são esquecidas"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é 'aprendizado federado' em IA?",
        new String[]{"Um método de treinamento de modelos de IA em computadores individuais", "Um método de aprendizado que requer servidores centrais para treinamento", "Um método de IA que não requer treinamento", "Um método para trocar dados entre nações"},
        new int[]{0} // Resposta correta é a opção A (índice 0)
));

perguntas.add(new PerguntaMista(
        "O que é um 'chatbot' em IA?",
        new String[]{"Um robô de limpeza", "Um programa de computador que simula conversas humanas", "Um programa de IA que joga xadrez", "Um dispositivo de reconhecimento de voz"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "O que é um 'agente de IA autônomo'?",
        new String[]{"Um programa de computador que requer intervenção humana constante", "Um programa de IA que opera sem intervenção humana direta", "Um assistente virtual que imita o comportamento humano", "Um robô que só funciona em ambientes controlados"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaMista(
        "Quais são os principais desafios éticos relacionados ao desenvolvimento e uso de sistemas de IA, e como a comunidade de IA está abordando essas questões?",
        new String[]{"Desafios técnicos relacionados à precisão dos modelos de IA.", "Desafios financeiros relacionados ao custo de desenvolvimento de IA.", "Desafios éticos relacionados à privacidade, preconceito e responsabilidade.", "Desafios legais relacionados a direitos autorais de algoritmos de IA."},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é um 'motor de inferência' em sistemas de IA?",
        new String[]{"Uma parte essencial do cérebro humano responsável pela tomada de decisões", "Um mecanismo que processa comandos de voz", "Um componente que aplica regras lógicas para chegar a conclusões com base em dados disponíveis", "Um dispositivo que realiza operações matemáticas avançadas"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "Em IA, o que é 'aprendizado não supervisionado'?",
        new String[]{"Um método de treinamento em que um supervisor humano fornece feedback constante", "Um tipo de aprendizado que não envolve a interação com o ambiente", "Um método que usa dados não rotulados para encontrar padrões e estruturas nos dados", "Um método exclusivamente usado em robótica"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é um 'turing test' (teste de Turing) em IA?",
        new String[]{"Um teste de velocidade para medir o desempenho de computadores", "Um teste para avaliar a capacidade de um robô de realizar tarefas físicas", "Um teste projetado para verificar se uma máquina pode exibir comportamento indistinguível do de um ser humano", "Um teste para medir a potência do processamento de texto"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "Em IA, o que é 'inteligência artificial fraca' (IA fraca)?",
        new String[]{"Uma forma de IA que é mais inteligente do que os seres humanos", "Uma forma de IA que pode superar desafios em qualquer domínio", "Uma forma de IA que lida com tarefas específicas e não exibe inteligência geral", "Uma forma de IA que não é útil em nenhum cenário"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "O que é 'processamento de linguagem natural' (PLN) em IA?",
        new String[]{"Um método de criptografia de mensagens de texto", "Uma técnica para tradução automática de idiomas", "Um método de reconhecimento de fala", "Um campo que se concentra no processamento e compreensão da linguagem humana"},
        new int[]{3} // Resposta correta é a opção D (índice 3)
));

perguntas.add(new PerguntaMista(
        "Qual é o principal objetivo do 'aprendizado profundo por reforço'?",
        new String[]{"Treinar modelos de IA para realizar tarefas de forma independente", "Ensinar algoritmos a realizar cálculos matemáticos complexos", "Otimizar a capacidade de reconhecimento de imagens", "Implementar recompensas em jogos de vídeo"},
        new int[]{0} // Resposta correta é a opção A (índice 0)
));

perguntas.add(new PerguntaMista(
        "O que é um 'algoritmo de busca' em IA?",
        new String[]{"Um programa de computador que procura informações confidenciais na web", "Uma técnica para criar senhas seguras", "Um método que encontra soluções em um espaço de possibilidades", "Um algoritmo de processamento de texto"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaMista(
        "Em IA, o que é a 'robótica autônoma'?",
        new String[]{"Um campo que se concentra apenas na criação de robôs humanóides", "Um campo que visa desenvolver robôs que podem operar de forma independente em ambientes variados", "Um método de automação de processos de escritório", "Uma técnica para melhorar a comunicação entre robôs"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

        return perguntas;
    }
}