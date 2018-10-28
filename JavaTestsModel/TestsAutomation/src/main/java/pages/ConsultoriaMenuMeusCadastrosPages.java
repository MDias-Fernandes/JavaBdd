package pages;

import org.openqa.selenium.By;

import commonsMethods.CommonsWebDriver;

public class ConsultoriaMenuMeusCadastrosPages {
	
	static By menuMyRegisters 				= By.xpath("//div[contains(text(), 'Meus Cadastros')]");
	static By submenuSuggestedForStart 		= By.xpath("//div[starts-with(@style,'display: flex;')][contains(text(), 'Sugeridas para in�cio')]");
	static By submenuWaitForFirstOrder 		= By.xpath("//div[starts-with(@style,'display: flex;')][contains(text(), 'Aguardando 1� pedido')]");
	static By submenuInicial 				= By.xpath("//div[starts-with(@style,'display: flex;')][contains(text(), 'In�cios')]");
	static By submenuReprovedAbandon		= By.xpath("//div[starts-with(@style,'display: flex;')][contains(text(), 'Reprovados/ Desist�ncia')]");
	static By submenuAllRegisters 			= By.xpath("//div[starts-with(@style,'display: flex;')][contains(text(), 'Todos os cadastros')]");
	static By submenuNewRegister 			= By.xpath("//div[starts-with(@style,'display: flex;')][contains(text(), 'Novo cadastro')]");
	static By screenTitleSuggestedForStart	= By.xpath("//div[starts-with(@class,'HeaderTop__')][contains(text(), 'Sugeridas para in�cio')]");
	static By screenWaitForFirstOrder		= By.xpath("//div[starts-with(@class,'HeaderTop__')][contains(text(), 'Aguardando 1� pedido')]");
	static By screenInicials				= By.xpath("//div[starts-with(@class,'HeaderTop__')][contains(text(), 'In�cios')]");
	static By screenReprovedAbandon			= By.xpath("//div[starts-with(@class,'HeaderTop__')][contains(text(), 'Reprovados/ Desist�ncia')]");
	static By screenAllRegisters			= By.xpath("//div[starts-with(@class,'HeaderTop__')][contains(text(), 'Todos os cadastros')]");
	static By screenNewRegister				= By.xpath("//div[starts-with(@class,'HeaderTop__')][contains(text(), 'Novo cadastro')]");
	
	
	public static void myRegisters() {
		CommonsWebDriver.sleepAndFindElement(1, menuMyRegisters).click();
	}
	
	
	public static void submenuSuggestedForStart() {
		CommonsWebDriver.sleepAndFindElement(1, submenuSuggestedForStart).click();
	}
	public static void screenTitleSuggestedForStart() {
		CommonsWebDriver.sleepAndFindElement(1, screenTitleSuggestedForStart);
		CommonsWebDriver.takeScreenShot(5, screenTitleSuggestedForStart);
	}
	
	
	public static void submenuWaitForFirstOrder() {
		CommonsWebDriver.sleepAndFindElement(1, submenuWaitForFirstOrder).click();
	}
	public static void screenWaitForFirstOrder() {
		CommonsWebDriver.sleepAndFindElement(1, screenWaitForFirstOrder);
		CommonsWebDriver.takeScreenShot(5, screenWaitForFirstOrder);
	}
	
	
	public static void submenuInicials() {
		CommonsWebDriver.sleepAndFindElement(1, submenuInicial).click();
	}
	public static void screenInicials() {
		CommonsWebDriver.sleepAndFindElement(1, screenInicials);
		CommonsWebDriver.takeScreenShot(5, screenInicials);
	}
	
	
	public static void submenuReprovedAbandon() {
		CommonsWebDriver.sleepAndFindElement(1, submenuReprovedAbandon).click();
	}
	public static void screenReprovedAbandon() {
		CommonsWebDriver.sleepAndFindElement(1, screenReprovedAbandon);
		CommonsWebDriver.takeScreenShot(5, screenReprovedAbandon);
	}
	
	
	public static void submenuAllRegisters() {
		CommonsWebDriver.sleepAndFindElement(1, submenuAllRegisters).click();
	}
	public static void screenAllRegisters() {
		CommonsWebDriver.sleepAndFindElement(1, screenAllRegisters);
		CommonsWebDriver.takeScreenShot(5, screenAllRegisters);
	}
	
	
	public static void submenuNewRegister() {
		CommonsWebDriver.sleepAndFindElement(1, submenuNewRegister).click();
	}
	public static void screenNewRegister() {
		CommonsWebDriver.sleepAndFindElement(1, screenNewRegister);
		CommonsWebDriver.takeScreenShot(5, screenNewRegister);
	}

}
