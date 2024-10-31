Feature: Cadastro de uma nova cidade

  Scenario: Sucesso ao cadastrar uma nova cidade
    Given o usuário tem as informações obrigatórias para cadastrar uma cidade
    When o usuário envia os dados para a API de cadastro de cidade
    Then a API retorna o status code 201 Created
    And o corpo da resposta contém os dados da cidade cadastrada

  Scenario: Falha ao cadastrar cidade com dados incompletos
    Given o usuário não preenche todos os campos obrigatórios
    When o usuário envia os dados para a API de cadastro de cidade
    Then a API retorna o status code 400 Bad Request
    And o corpo da resposta contém a mensagem de erro
