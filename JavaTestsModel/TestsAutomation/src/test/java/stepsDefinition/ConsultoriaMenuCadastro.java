package stepsDefinition;

import cucumber.api.java.en.When;
import actions.ConsultoriaMenuMeusCadastrosActions;

public class ConsultoriaMenuCadastro {
	@When("^acesso o menu Meus Cadastros$")
	public void acesso_o_menu_Meus_Cadastros() throws Throwable {
	    ConsultoriaMenuMeusCadastrosActions.myRegisters();
	}
	
	// Sugeridas Para Inicio
	@When("^valido o submenu Sugeridas para Inicio$")
	public void valido_o_submenu_Sugeridas_para_Inicio() throws Throwable {
		ConsultoriaMenuMeusCadastrosActions.submenuSuggestedForStart();
	}
	
	@When("^o titulo da janela muda para Meus Cadastros$")
	public void o_titulo_da_janela_muda_para_Meus_Cadastros() throws Throwable {
		ConsultoriaMenuMeusCadastrosActions.screenTitleSuggestedForStart();
	}
	
	
	// Aguardando Primeiro Pedido
	@When("^valido o submenu Aguardando Primeiro Pedido$")
	public void valido_o_submenu_Aguardando_Primeiro_Pedido() throws Throwable {
		ConsultoriaMenuMeusCadastrosActions.submenuWaitForFirstOrder();
	}
	
	@When("^o titulo da janela muda para Aguardando Primeiro Pedido$")
	public void o_titulo_da_janela_muda_para_Aguardando_Primeiro_Pedido() throws Throwable {
		ConsultoriaMenuMeusCadastrosActions.screenWaitForFirstOrder();
	}
	
	
	// Inicios
	@When("^valido o submenu Inicios$")
	public void valido_o_submenu_Inicios() throws Throwable {
		ConsultoriaMenuMeusCadastrosActions.submenuInicials();
	}
	
	@When("^o titulo da janela muda para Inicios$")
	public void o_titulo_da_janela_muda_para_Inicios() throws Throwable {
		ConsultoriaMenuMeusCadastrosActions.screenInicials();
	}
	
	
	// Reprovados/Desistencias
	@When("^valido o submenu Reprovados Desistencias$")
	public void valido_o_submenu_Reprovados_Desistencias() throws Throwable {
		ConsultoriaMenuMeusCadastrosActions.submenuReprovedAbandon();
	}
	
	@When("^o titulo da janela muda para Reprovados Desistencias$")
	public void o_titulo_da_janela_muda_para_Reprovados_Desistencias() throws Throwable {
		ConsultoriaMenuMeusCadastrosActions.screenReprovedAbandon();
	}
	
	
	// Todos os Cadastros
	@When("^valido o submenu Todos os Cadastros$")
	public void valido_o_submenu_Todos_os_Cadastros() throws Throwable {
		ConsultoriaMenuMeusCadastrosActions.submenuAllRegisters();
	}
	
	@When("^o titulo da janela muda para Todos os Cadastros$")
	public void o_titulo_da_janela_muda_para_Todos_os_Cadastros() throws Throwable {
		ConsultoriaMenuMeusCadastrosActions.screenAllRegisters();
	}
	
	
	// Novo Cadastro
	@When("^valido o submenu Novo Cadastro$")
	public void valido_o_submenu_Novo_Cadastro() throws Throwable {
		ConsultoriaMenuMeusCadastrosActions.submenuNewRegister();
	}
	
	@When("^o titulo da janela muda para Novo Cadastro$")
	public void o_titulo_da_janela_muda_para_Novo_Cadastro() throws Throwable {
		ConsultoriaMenuMeusCadastrosActions.screenNewRegister();
	}
}