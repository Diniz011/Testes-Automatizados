Feature: Consulta de informações de tráfego

  Scenario: Sucesso ao consultar o tráfego
    Given o usuário possui permissão para consultar o tráfego
    When o usuário faz uma requisição para a API de tráfego
    Then a API retorna o status code 200 OK
    And o corpo da resposta contém as informações de tráfego atualizadas
