$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ValidacaoElementosConsultoria.feature");
formatter.feature({
  "line": 2,
  "name": "Validacao de elementos em tela",
  "description": "",
  "id": "validacao-de-elementos-em-tela",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TelaConsultoria"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "Acessar a aplicacao Consultoria",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "acesso a pagina principal do app Consultoria",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "insiro credenciais validas nos campos requeridos",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "clico no botao Login",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonsSteps.acesso_a_pagina_principal_do_app_Consultoria()"
});
formatter.result({
  "duration": 120403350366,
  "status": "passed"
});
formatter.match({
  "location": "ConsultoriaLogin.insiro_credenciais_validas_nos_campos_requeridos()"
});
formatter.result({
  "duration": 6647704989,
  "error_message": "org.openqa.selenium.TimeoutException: Build info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027SAO-6X5Y9R2\u0027, ip: \u0027172.16.17.212\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: CommonsWebDriver\r\n\tat commonsMethods.CommonsWebDriver.sleepAndFindElement(CommonsWebDriver.java:89)\r\n\tat actions.ConsultoriaLoginActions.setLogin(ConsultoriaLoginActions.java:22)\r\n\tat stepsDefinition.ConsultoriaLogin.insiro_credenciais_validas_nos_campos_requeridos(ConsultoriaLogin.java:11)\r\n\tat ✽.And insiro credenciais validas nos campos requeridos(ValidacaoElementosConsultoria.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CommonsSteps.clico_no_botao_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "Submenus do menu lateral esquerdo Meus Cadastros",
  "description": "",
  "id": "validacao-de-elementos-em-tela;submenus-do-menu-lateral-esquerdo-meus-cadastros",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@TelaConsultoria"
    },
    {
      "line": 17,
      "name": "@MenuMeusCadastros"
    },
    {
      "line": 17,
      "name": "@SugeridasParaInicio"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "acesso o menu Meus Cadastros",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "valido o submenu Sugeridas para Inicio",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "o titulo da janela muda para Meus Cadastros",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "fecho a pagina",
  "keyword": "And "
});
formatter.match({
  "location": "ConsultoriaMenuCadastro.acesso_o_menu_Meus_Cadastros()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ConsultoriaMenuCadastro.valido_o_submenu_Sugeridas_para_Inicio()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ConsultoriaMenuCadastro.o_titulo_da_janela_muda_para_Meus_Cadastros()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CommonsSteps.fecho_a_pagina()"
});
formatter.result({
  "status": "skipped"
});
});