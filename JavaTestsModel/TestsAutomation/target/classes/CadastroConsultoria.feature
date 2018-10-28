@CadastroConsultoria
Feature: Cadastro de Consultoras

Background:
    Given acesso a pagina principal do app Consultoria
    And insiro credenciais validas nos campos requeridos
    And clico no botao Login
    And a pagina principal e carregada com sucesso

  @CadastroConsultoria @CadastroValido
  Scenario: Insercao de dados validos
  	When clico no botao cadastro
  	And insiro um cpf valido
  	And insiro um nome valido
  	And seleciono um genero
  	And insiro uma data de nascimento
  	And insiro um email valido
  	And insiro um telefone valido
  	And insiro um CEP comum
  	Then valido estrutura de validacao