@LoginConsultoria
Feature: Acesso e autenticacao no aplicativo Web - Consultoria

Background:
    Given acesso a pagina principal do app Consultoria

  @LoginConsultoria @LoginValido
  Scenario: Realizar um login valido 
    When insiro credenciais validas nos campos requeridos
    Then clico no botao Login
    And fecho a pagina
    
  @LoginConsultoria @LoginInvalido
  Scenario: Realizar um login invalido
    When insiro credenciais invalidas nos campos requeridos
    And clico no botao Login
    Then um erro e carregado na tela
    And fecho a pagina