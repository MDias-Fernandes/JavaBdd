package actions;

import commonsMethods.CommonsWebDriver;
import pages.ConsultoriaMenuMeusCadastrosPages;

public class ConsultoriaMenuMeusCadastrosActions extends ConsultoriaMenuMeusCadastrosPages {
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
		CommonsWebDriver.sleepAndFindElement(3, screenInicials);
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
