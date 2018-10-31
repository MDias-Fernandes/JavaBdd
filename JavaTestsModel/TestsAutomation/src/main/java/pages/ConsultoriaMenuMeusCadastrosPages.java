package pages;

import org.openqa.selenium.By;
import commonsMethods.CommonsWebDriver;

public class ConsultoriaMenuMeusCadastrosPages extends CommonsWebDriver{
	
	protected static By menuMyRegisters 				= By.xpath("//div[contains(text(), 'Meus Cadastros')]");
	protected static By submenuSuggestedForStart 		= By.xpath("//div[starts-with(@style,'display: flex;')][contains(text(), 'Sugeridas para início')]");
	protected static By submenuWaitForFirstOrder 		= By.xpath("//div[starts-with(@style,'display: flex;')][contains(text(), 'Aguardando 1° pedido')]");
	protected static By submenuInicial 					= By.xpath("//div[starts-with(@style,'display: flex;')][contains(text(), 'Inícios')]");
	protected static By submenuReprovedAbandon			= By.xpath("//div[starts-with(@style,'display: flex;')][contains(text(), 'Reprovados/ Desistência')]");
	protected static By submenuAllRegisters 			= By.xpath("//div[starts-with(@style,'display: flex;')][contains(text(), 'Todos os cadastros')]");
	protected static By submenuNewRegister 				= By.xpath("//div[starts-with(@style,'display: flex;')][contains(text(), 'Novo cadastro')]");
	protected static By screenTitleSuggestedForStart	= By.xpath("//div[starts-with(@class,'HeaderTop__')][contains(text(), 'Sugeridas para início')]");
	protected static By screenWaitForFirstOrder			= By.xpath("//div[starts-with(@class,'HeaderTop__')][contains(text(), 'Aguardando 1° pedido')]");
	protected static By screenInicials					= By.xpath("//div[starts-with(@class,'HeaderTop__')][contains(text(), 'Inícios')]");
	protected static By screenReprovedAbandon			= By.xpath("//div[starts-with(@class,'HeaderTop__')][contains(text(), 'Reprovados/ Desistência')]");
	protected static By screenAllRegisters				= By.xpath("//div[starts-with(@class,'HeaderTop__')][contains(text(), 'Todos os cadastro')]");
	protected static By screenNewRegister				= By.xpath("//div[starts-with(@class,'HeaderTop__')][contains(text(), 'Novo cadastro')]");

}
