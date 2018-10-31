package actions;

import commonsMethods.CommonsWebDriver;
import pages.ConsultoriaTelaPrincipalPages;

public class ConsultoriaTelaPrincipalActions extends ConsultoriaTelaPrincipalPages {
	public static void elementsVisibilityOnHeader() {
		CommonsWebDriver.sleepAndFindElement(1, profileIcon);
		CommonsWebDriver.sleepAndFindElement(1, logoNatura);
		CommonsWebDriver.sleepAndFindElement(1, homeText);
		CommonsWebDriver.sleepAndFindElement(1, newRegister);
		CommonsWebDriver.takeScreenShot(1, logoNatura);
	}
	
	public static void sliderVisibility() {
		CommonsWebDriver.sleepAndFindElement(1, slider);
	}
	
	public static void boxSendNewMessage() {
		CommonsWebDriver.sleepAndFindElement(1, sendNewMessage);
		CommonsWebDriver.takeScreenShot(1, sendNewMessage);
	}
	
	public static void footerElements() {
		CommonsWebDriver.sleepAndFindArrayOfElements(1, footerElements);
		CommonsWebDriver.takeScreenShot(1, footerElements);
	}

}
