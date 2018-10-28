package stepsDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import actions.ConsultoriaLoginActions;
import commonsMethods.*;

public class ConsultoriaLogin {
	
	@When("^insiro credenciais validas nos campos requeridos$")
	public void insiro_credenciais_validas_nos_campos_requeridos() throws Throwable {
		ConsultoriaLoginActions.setLogin("11232633");
		ConsultoriaLoginActions.setPassword("senha123");
	}

	@Then("^a pagina principal e carregada com sucesso$")
	public void a_pagina_principal_e_carregada_com_sucesso() throws Throwable {
		CommonsWebDriver.validateWindowTextTitle(15, "Home - Natura");
	}
}