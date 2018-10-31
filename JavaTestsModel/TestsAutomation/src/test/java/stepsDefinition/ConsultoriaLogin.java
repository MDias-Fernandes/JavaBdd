package stepsDefinition;

import actions.ConsultoriaLoginActions;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;

public class ConsultoriaLogin {
	
	@When("^insiro credenciais validas nos campos requeridos$")
	public void insiro_credenciais_validas_nos_campos_requeridos() throws Throwable {
		ConsultoriaLoginActions.setLogin(ConfigFileReader.user("gdn", "1"));
		ConsultoriaLoginActions.setPassword(ConfigFileReader.password("gdn", "1"));
	}

}