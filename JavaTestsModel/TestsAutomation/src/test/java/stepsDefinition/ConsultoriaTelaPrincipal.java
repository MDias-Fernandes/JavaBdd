package stepsDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ConsultoriaTelaPrincipalPages;

public class ConsultoriaTelaPrincipal {
	@When("^valido o header$")
	public void valido_o_header() throws Throwable {
	    ConsultoriaTelaPrincipalPages.elementsVisibilityOnHeader();
	}

	@When("^valido a presenca de um slider$")
	public void valido_a_presenca_de_um_slider() throws Throwable {
		ConsultoriaTelaPrincipalPages.sliderVisibility();
	}

	@When("^valido o icone de envio de mensagem$")
	public void valido_o_icone_de_envio_de_mensagem() throws Throwable {
		ConsultoriaTelaPrincipalPages.boxSendNewMessage();
	}

	@Then("^valido os elementos do footer$")
	public void valido_os_elementos_do_footer() throws Throwable {
	    ConsultoriaTelaPrincipalPages.footerElements();
	}
	
}
