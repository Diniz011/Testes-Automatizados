Gestão de Tráfego

Este repositório contém o projeto Gestão de Tráfego, uma aplicação desenvolvida em Java Spring Boot para gerenciar o tráfego urbano em Smart Cities. O foco principal é a implementação de testes automatizados utilizando BDD (Behavior Driven Development) com Gherkin, além de testes de API que incluem validação de status code, corpo de resposta e testes de contrato utilizando JSON Schema.

Índice

	•	Descrição do Projeto
	•	Pré-requisitos
	•	Instalação
	•	Configuração
	•	Execução da Aplicação
	•	Execução dos Testes
	•	Estrutura do Projeto
	•	Tecnologias Utilizadas
	•	Observações
	•	Contato
	•	Licença

Descrição do Projeto:

A aplicação Gestão de Tráfego visa otimizar o gerenciamento de tráfego em cidades inteligentes, proporcionando funcionalidades como:

	•	Cadastro e gerenciamento de usuários
	•	Monitoramento de vias e congestionamentos
	•	Integração com sistemas de semáforos
	•	Relatórios e análises de dados de tráfego

Os testes automatizados implementados garantem a qualidade e confiabilidade das funcionalidades críticas, assegurando que o sistema responda corretamente tanto a cenários positivos quanto negativos.



Pré-requisitos:

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

	•	Java JDK 11 ou superior
	•	Maven (para gerenciamento de dependências)
	•	Docker e Docker Compose (se optar por executar via contêineres)
	•	Git (opcional, para clonar o repositório)


Instalação:

	•   Clonar o Repositório:

    •   git clone https://github.com/Diniz011/Testes-Automatizados.git
 
    •   cd Testes-Automatizados


Construir o Projeto com Maven:

    •   mvn clean install

Este comando irá baixar todas as dependências necessárias e compilar o projeto.




Configuração do projeto:

Configure as seguintes variáveis de ambiente no arquivo application.properties:

	•	Banco de Dados:
	•	DB_HOST: Endereço do host do banco de dados (padrão: oracle.fiap.com.br)
	•	DB_PORT: Porta do banco de dados (padrão: 1521)
	•	DB_NAME: Nome do banco de dados (padrão: ORCL)
	•	DB_USER: Seu usuário do banco de dados
	•	DB_PASSWORD: Sua senha do banco de dados

Arquivo de Configuração:

Atualize o arquivo src/main/resources/application.properties conforme necessário.



Execute a aplicação utilizando o Maven:

    •   Coloque este comando abaixo no seu terminal:
    •   mvn spring-boot:run
    •   A aplicação estará disponível em http://localhost:8080.


Depois execute os testes Automatizados com Maven

Para executar todos os testes cole este comando abaixo no seu terminal:

    •   mvn test


Tecnologias Utilizadas:

	•	Java 11
	•	Spring Boot 3
	•	JUnit 5
	•	Gherkin
	•	RestAssured
	•	JSON Schema Validator
	•	Maven
	•	Docker


Observações:

Informações Sensíveis: Certifique-se de que nenhuma informação sensível, como senhas ou chaves de API, esteja comprometida nos arquivos de configuração ou no código.

Compatibilidade: O projeto foi testado com as versões especificadas dos pré-requisitos. Versões diferentes podem causar comportamentos inesperados.

Contato:

Grupo: Cauê Diniz - RM 551233, Fabiano Pires - RM 552145, Raphael Monteiro - RM 551115, Robinson Viera - RM 55208

Email: ca_diniz911@hotmail.com.br

	•	GitHub: https://github.com/Diniz011


Licença

Nota: Ajuste as informações como nome, email, usuário do GitHub e detalhes específicos do projeto conforme necessário. Certifique-se também de incluir quaisquer scripts adicionais, como scripts SQL para configuração do banco de dados, caso sejam necessários para a execução da aplicação.

Se tiver alguma dúvida ou precisar de assistência adicional, não hesite em entrar em contato conosco pelo Teams.

