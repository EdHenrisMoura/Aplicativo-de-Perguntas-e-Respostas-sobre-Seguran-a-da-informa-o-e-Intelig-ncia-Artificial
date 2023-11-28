import java.util.ArrayList;
import java.util.List;

public class PerguntaSeguranca {
    private String pergunta;
    private String[] alternativas;
    private int[] respostasCorretas; // Alterado para int[]

    public PerguntaSeguranca(String pergunta, String[] alternativas, int[] respostasCorretas) {
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

    public static List<PerguntaSeguranca> criarPerguntasSeguranca() {
        List<PerguntaSeguranca> perguntas = new ArrayList<>();

        perguntas.add(new PerguntaSeguranca(
                "A autenticação de dois fatores (2FA) é um método de segurança que adiciona uma camada adicional de autenticação além da senha tradicional. Como funciona, no caso, qual é essa camada adicional de segurança?",
                new String[]{"Usuário e senha únicos", "Verificação por SMS", "Senha longa e complexa", "Firewall de última geração"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaSeguranca(
                "A engenharia social é uma abordagem que explora a manipulação psicológica para obter informações confidenciais ou acesso não autorizado. Mas como isso funciona?",
                new String[]{"Um método para criptografar dados", "Uma técnica para manipular pessoas e obter informações confidenciais", "Um tipo de firewall", "Um protocolo de segurança de rede"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaSeguranca(
                "Um ataque de 'phishing' é um tipo de ataque cibernético que envolve enganar as vítimas para que revelem informações confidenciais. Mas como isso é realizado?",
                new String[]{"Fazendo um ataque de negação de serviço (DDoS)", "Fazendo Uma técnica de engenharia social para obter senhas", "Fazendo Um método para criptografar e-mails", "Fazendo Uma técnica de criptografia de dados"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaSeguranca(
                "Qual das seguintes opções é uma prática recomendada para criar senhas seguras?",
                new String[]{"Usar a mesma senha para todas as contas", "Usar senhas curtas e simples", "Usar senhas complexas com letras, números e caracteres especiais", "Compartilhar senhas com colegas de trabalho"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaSeguranca(
                "O que é um firewall em segurança de rede?",
                new String[]{"Um dispositivo para proteger contra sobrecarga de tráfego na rede", "Uma técnica para ocultar endereços IP", "Um software usado para monitorar o tráfego de rede e bloquear atividades suspeitas", "Um protocolo de criptografia de dados"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaSeguranca(
                "Qual das seguintes opções é uma medida de segurança para proteger um computador contra malware?",
                new String[]{"Desativar todas as atualizações de software", "Instalar um antivírus atualizado", "Compartilhar regularmente arquivos desconhecidos", "Usar senhas fracas"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaSeguranca(
                "O que é Ransomware?",
                new String[]{"Um ataque que rouba informações pessoais", "Um ataque que sequestra arquivos e exige um resgate para recuperá-los", "Um ataque que sobrecarrega um servidor de rede", "Um ataque que danifica fisicamente o hardware de um computador"},
                new int[]{1} // Resposta correta é a opção B (índice 1)
        ));

        perguntas.add(new PerguntaSeguranca(
                "A criptografia é usada para proteger dados sensíveis durante a transmissão e armazenamento mas exatamente o que é criptografia?",
                new String[]{"Um tipo de malware", "Um dispositivo de firewall", "Um processo de codificação de dados para torná-los ilegíveis sem a chave correta", "Um protocolo de autenticação de rede"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaSeguranca(
                "Qual é a principal ameaça à segurança da informação que envolve o uso não autorizado de senhas roubadas ou vazadas?",
                new String[]{"Ataque de phishing", "Ataque de negação de serviço (DDoS)", "Ataque de força bruta", "Ataque de engenharia social"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

        perguntas.add(new PerguntaSeguranca(
                "O que é um 'patch' de segurança?",
                new String[]{"Um dispositivo de proteção de rede", "Um tipo de senha complexa", "Uma atualização de software projetada para corrigir vulnerabilidades de segurança", "Uma técnica de criptografia de e-mail"},
                new int[]{2} // Resposta correta é a opção C (índice 2)
        ));

perguntas.add(new PerguntaSeguranca(
        "O que é um ataque de força bruta?",
        new String[]{"Um ataque que explora vulnerabilidades no software", "Um ataque que tenta todas as combinações possíveis de senhas até encontrar a correta", "Um ataque que sequestra arquivos e exige um resgate", "Um ataque que envolve a engenharia social"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaSeguranca(
        "O que é um certificado SSL e qual é sua função na segurança de informações?",
        new String[]{"Um software de criptografia de e-mails", "Um tipo de ataque de negação de serviço (DDoS)", "Um protocolo de segurança de rede", "Um protocolo de criptografia usado para proteger a comunicação na internet"},
        new int[]{3} // Resposta correta é a opção D (índice 3)
));

perguntas.add(new PerguntaSeguranca(
        "O que é a autenticação de dois fatores (2FA) e por que é importante?",
        new String[]{"Um método de criptografia de dados", "Um protocolo de autenticação de rede", "Um processo de validação que requer duas formas diferentes de identificação para acessar uma conta", "Um tipo de ataque cibernético"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é um ataque de injeção de SQL?",
        new String[]{"Um ataque que sequestra arquivos e exige um resgate", "Um método para criptografar dados", "Uma técnica de engenharia social para obter senhas", "Um ataque que explora vulnerabilidades em aplicativos da web"},
        new int[]{3} // Resposta correta é a opção D (índice 3)
));

perguntas.add(new PerguntaSeguranca(
        "O que é um vírus de computador e como ele se propaga?",
        new String[]{"Um tipo de ataque de negação de serviço (DDoS)", "Um programa malicioso que se anexa a arquivos e se espalha quando esses arquivos são compartilhados", "Uma técnica de criptografia de dados", "Um protocolo de segurança de rede"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaSeguranca(
        "Qual é a importância de manter o software e os sistemas operacionais atualizados?",
        new String[]{"Para aumentar o desempenho do computador", "Para economizar dinheiro em licenças de software", "Para corrigir vulnerabilidades de segurança e bugs", "Para garantir a compatibilidade com dispositivos mais antigos"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é um ataque de negação de serviço (DDoS) e como ele funciona?",
        new String[]{"Um ataque que sobrecarrega um servidor de rede", "Uma técnica para ocultar endereços IP", "Um protocolo de autenticação de rede", "Um método para criptografar e-mails"},
        new int[]{0} // Resposta correta é a opção A (índice 0)
));

perguntas.add(new PerguntaSeguranca(
        "O que é engenharia reversa e como ela está relacionada à segurança da informação?",
        new String[]{"Um ataque que rouba informações pessoais", "Um processo de desmontar e analisar um software ou hardware para entender seu funcionamento interno", "Um ataque que explora vulnerabilidades no software", "Um dispositivo para proteger contra sobrecarga de tráfego na rede"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaSeguranca(
        "Qual é a diferença entre um firewall de hardware e um firewall de software?",
        new String[]{"Um firewall de hardware é um dispositivo físico, enquanto um firewall de software é um programa de computador", "Ambos são a mesma coisa e podem ser usados indistintamente", "Um firewall de hardware é mais vulnerável a ataques cibernéticos", "Um firewall de software é mais caro que um firewall de hardware"},
        new int[]{0} // Resposta correta é a opção A (índice 0)
));

perguntas.add(new PerguntaSeguranca(
        "O que é criptografia de ponta a ponta e em que contexto é comumente usada?",
        new String[]{"Um protocolo de criptografia de dados", "Uma técnica de segurança usada em dispositivos móveis", "Um método de codificação de dados que torna a comunicação ilegível para terceiros, apenas as partes envolvidas podem decifrar", "Uma técnica para ocultar endereços IP"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));


perguntas.add(new PerguntaSeguranca(
        "O que é um ataque de spear phishing?",
        new String[]{"Um ataque que rouba informações pessoais", "Um tipo de ataque de força bruta", "Um ataque de phishing direcionado a uma pessoa ou organização específica, geralmente usando informações personalizadas", "Um ataque que envolve a engenharia social"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é a autenticação de dois fatores (2FA) baseada em token?",
        new String[]{"Um protocolo de autenticação de rede", "Um método de autenticação que envolve o uso de um dispositivo físico, como um token, para gerar códigos temporários", "Um tipo de ataque cibernético", "Um protocolo de criptografia usado para proteger a comunicação na internet"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaSeguranca(
        "O que é a GDPR (Regulamento Geral de Proteção de Dados) e qual é sua importância para a segurança da informação?",
        new String[]{"Um protocolo de segurança de rede", "Uma lei europeia que regula a proteção de dados pessoais e a privacidade dos cidadãos", "Um dispositivo para proteger contra sobrecarga de tráfego na rede", "Um protocolo de autenticação de rede"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaSeguranca(
        "O que é uma VPN (Rede Virtual Privada) e como ela ajuda na segurança da informação?",
        new String[]{"Uma técnica de segurança usada em dispositivos móveis", "Um protocolo de criptografia de dados", "Uma conexão segura que permite o acesso a redes privadas pela internet, protegendo a comunicação de terceiros", "Um ataque de negação de serviço (DDoS)"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é engenharia social reversa?",
        new String[]{"Um método para criptografar dados", "Um processo de manipulação psicológica que envolve convencer uma pessoa a fazer algo contra sua vontade", "Um ataque que explora vulnerabilidades no software", "Um tipo de ataque de phishing"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaSeguranca(
        "Qual é a importância de fazer backup regularmente de dados e sistemas?",
        new String[]{"Para economizar espaço de armazenamento", "Para evitar atualizações de software", "Para proteger contra perda de dados devido a falhas de hardware, ataques de malware ou desastres", "Para aumentar a velocidade da conexão de rede"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é um ataque de 'man-in-the-middle' e como ele funciona?",
        new String[]{"Um ataque que sobrecarrega um servidor de rede", "Um ataque que sequestra arquivos e exige um resgate", "Um ataque que intercepta a comunicação entre duas partes, sem que elas saibam", "Um ataque que envolve a engenharia social"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é um 'honeypot' e qual é o seu propósito na segurança da informação?",
        new String[]{"Um ataque que rouba informações pessoais", "Uma técnica de segurança usada em dispositivos móveis", "Um sistema de armadilha projetado para atrair hackers e monitorar suas atividades", "Um protocolo de segurança de rede"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é autenticação de biometria e como ela é usada na segurança da informação?",
        new String[]{"Um método de autenticação que envolve o uso de características físicas únicas, como impressões digitais ou reconhecimento facial", "Um dispositivo para proteger contra sobrecarga de tráfego na rede", "Um protocolo de autenticação de rede", "Um processo de criptografia de dados"},
        new int[]{0} // Resposta correta é a opção A (índice 0)
));

perguntas.add(new PerguntaSeguranca(
        "O que é a política de privacidade de dados e por que é importante?",
        new String[]{"Uma técnica para ocultar endereços IP", "Um tipo de ataque cibernético", "Um conjunto de regras que define como os dados pessoais dos usuários são coletados, armazenados e usados por uma organização", "Um ataque que explora vulnerabilidades no software"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é a política de privacidade de dados e por que é importante?",
        new String[]{"Uma técnica para ocultar endereços IP", "Um tipo de ataque cibernético", "Um conjunto de regras que define como os dados pessoais dos usuários são coletados, armazenados e usados por uma organização", "Um ataque que explora vulnerabilidades no software"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é criptomoeda e como a segurança da informação está relacionada ao seu uso?",
        new String[]{"Uma técnica para ocultar endereços IP", "Uma forma de dinheiro digital que utiliza criptografia para garantir transações seguras", "Um tipo de ataque cibernético", "Uma técnica de criptografia de e-mail"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaSeguranca(
        "O que é autenticação de dois fatores (2FA) baseada em biometria e como ela funciona?",
        new String[]{"Um protocolo de segurança de rede", "Um método de autenticação que utiliza características físicas únicas, como impressões digitais ou reconhecimento facial", "Um ataque de negação de serviço (DDoS)", "Um protocolo de autenticação de rede"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaSeguranca(
        "O que é um ataque de 'zero-day' e por que é considerado uma ameaça grave à segurança da informação?",
        new String[]{"Um tipo de ataque de força bruta", "Um ataque que explora vulnerabilidades conhecidas em sistemas e aplicativos", "Um ataque que ocorre em uma data específica", "Um ataque que explora uma vulnerabilidade desconhecida que ainda não foi corrigida pelos desenvolvedores"},
        new int[]{3} // Resposta correta é a opção D (índice 3)
));

perguntas.add(new PerguntaSeguranca(
        "O que é criptografia de disco e como ela ajuda a proteger os dados armazenados em dispositivos?",
        new String[]{"Um método para criptografar e-mails", "Um processo de codificação de todo o conteúdo de um disco rígido ou dispositivo de armazenamento", "Um protocolo de segurança de rede", "Um ataque que sequestra arquivos e exige um resgate"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaSeguranca(
        "O que é um 'firewall de inspeção profunda de pacotes' e como ele difere de um firewall tradicional?",
        new String[]{"Um dispositivo para proteger contra sobrecarga de tráfego na rede", "Uma técnica para ocultar endereços IP", "Um dispositivo de segurança que analisa o conteúdo dos pacotes de dados em busca de ameaças", "Um protocolo de autenticação de rede"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é a autenticação de dois fatores (2FA) por meio de um aplicativo móvel e como ela funciona?",
        new String[]{"Um tipo de ataque cibernético", "Um método de autenticação que utiliza um aplicativo móvel para gerar códigos temporários", "Uma técnica de segurança usada em dispositivos móveis", "Um protocolo de criptografia usado para proteger a comunicação na internet"},
        new int[]{1} // Resposta correta é a opção B (índice 1)
));

perguntas.add(new PerguntaSeguranca(
        "O que é 'engenharia social baseada em pretextos' e como funciona?",
        new String[]{"Um ataque que explora vulnerabilidades no software", "Um método para criptografar dados", "Uma técnica de engenharia social que envolve a criação de pretextos ou histórias fictícias para obter informações confidenciais", "Um ataque de phishing"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é um 'sandbox' de segurança e qual é seu papel na proteção contra malware?",
        new String[]{"Um protocolo de segurança de rede", "Uma técnica de criptografia de dados", "Um ambiente isolado e seguro em que os programas podem ser executados sem afetar o sistema principal", "Um dispositivo para proteger contra sobrecarga de tráfego na rede"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é um 'WAF' (Web Application Firewall) e como ele ajuda a proteger aplicativos da web?",
        new String[]{"Uma técnica para ocultar endereços IP", "Um ataque de negação de serviço (DDoS)", "Um dispositivo de segurança que monitora e protege aplicativos da web contra ameaças e ataques cibernéticos", "Um protocolo de autenticação de rede"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));

perguntas.add(new PerguntaSeguranca(
        "O que é um 'certificado digital' e como ele é usado na autenticação e na segurança de transações online?",
        new String[]{"Um método de criptografia de e-mail", "Um tipo de ataque cibernético", "Um arquivo digital que contém informações de identificação e chave pública, usado para autenticar identidades e proteger transações online", "Um protocolo de segurança de rede"},
        new int[]{2} // Resposta correta é a opção C (índice 2)
));


        

        return perguntas;
    }
}