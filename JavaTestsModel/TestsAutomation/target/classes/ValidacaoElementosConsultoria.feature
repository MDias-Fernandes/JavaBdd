@TelaConsultoria
Feature: Validacao de elementos em tela

Background: Acessar a aplicacao Consultoria
    Given acesso a pagina principal do app Consultoria
    And insiro credenciais validas nos campos requeridos
    Then clico no botao Login

  @TelaConsultoria @ElementosPrincipais
  Scenario: Elementos principais
  	When valido o header
  	And valido a presenca de um slider
  	And valido o icone de envio de mensagem
  	Then valido os elementos do footer
  	And fecho a pagina
  	
  @TelaConsultoria @MenuMeusCadastros @SugeridasParaInicio
  Scenario: Submenus do menu lateral esquerdo Meus Cadastros
  	When acesso o menu Meus Cadastros
  	And valido o submenu Sugeridas para Inicio
  	And o titulo da janela muda para Meus Cadastros
  	And fecho a pagina
  	
  @TelaConsultoria @MenuMeusCadastros @AguardandoPrimeiroPedido
  Scenario: Submenus do menu lateral esquerdo Aguardando Primeiro Pedido
  	When acesso o menu Meus Cadastros
  	And valido o submenu Aguardando Primeiro Pedido
  	And o titulo da janela muda para Aguardando Primeiro Pedido
  	And fecho a pagina

  @TelaConsultoria @MenuMeusCadastros @Inicio
  Scenario: Submenus do menu lateral esquerdo Inicios
  	When acesso o menu Meus Cadastros
  	And valido o submenu Inicios
  	And o titulo da janela muda para Inicios
  	And fecho a pagina
  	
  	  @TelaConsultoria @MenuMeusCadastros @ReprovadaDesistencia
  Scenario: Submenus do menu lateral esquerdo Reprovados Desistencias
  	When acesso o menu Meus Cadastros
  	And valido o submenu Reprovados Desistencias
  	And o titulo da janela muda para Reprovados Desistencias
  	And fecho a pagina
  	
  	  @TelaConsultoria @MenuMeusCadastros @TodosOsCadastros
  Scenario: Submenus do menu lateral esquerdo Todos os Cadastros
  	When acesso o menu Meus Cadastros
  	And valido o submenu Todos os Cadastros
  	And o titulo da janela muda para Todos os Cadastros
  	And fecho a pagina
  	
  	  @TelaConsultoria @MenuMeusCadastros @NovoRegistro
  Scenario: Submenus do menu lateral esquerdo Novo Cadastro
  	When acesso o menu Meus Cadastros
  	And valido o submenu Novo Cadastro
  	And o titulo da janela muda para Novo Cadastro
  	And fecho a pagina