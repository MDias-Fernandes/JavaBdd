package commonsMethods;

import actions.ConsultoriaLoginActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;


public class CommonsSteps {
	@Given("^acesso a pagina principal do app Consultoria$")
	public void acesso_a_pagina_principal_do_app_Consultoria() throws Throwable {
		CommonsWebDriver.getUrl(ConfigFileReader.environment("dev"));
	}

	@When("^clico no botao Login$")
	public void clico_no_botao_Login() throws Throwable {
		ConsultoriaLoginActions.clickLogin();
	}

	@Then("^fecho a pagina$")
	public void fecho_a_pagina() throws Throwable {
		CommonsWebDriver.closeWindow();
	}
}