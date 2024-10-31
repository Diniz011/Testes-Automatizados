Feature: Consulta de histórico de tráfego

  Scenario: Histórico de tráfego disponível
    Given uma cidade registrada com dados históricos de tráfego
    When o usuário consulta o histórico de tráfego da cidade
    Then a API retorna o status code 200 OK
    And o corpo da resposta contém o histórico de tráfego para a cidade

  Scenario: Histórico de tráfego inexistente para cidade
    Given uma cidade sem dados históricos
    When o usuário tenta consultar o histórico de tráfego da cidade
    Then a API retorna o status code 404 Not Found
    And o corpo da resposta contém uma mensagem de erro
