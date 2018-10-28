package pages;

import org.openqa.selenium.By;

import commonsMethods.CommonsWebDriver;

public class ConsultoriaTelaPrincipalPages {
	
	static By profileIcon 				= By.xpath("//div[starts-with(@class, 'HeaderTop__AvatarLink')]");
	static By logoNatura 				= By.cssSelector("img[title='Natura']");
	static By homeText 					= By.xpath("//div[starts-with(@class,'HeaderTop__Section')][contains(text(), 'Home')]");
	static By newRegister 				= By.xpath("//span[contains(text(), 'Novo cadastro')]");
	static By newOrder 					= By.xpath("//span[contains(text(), 'Novo Pedido')]");
	static By indicators 				= By.xpath("//span[contains(text(), 'Indicadores')]");
	static By promotions 				= By.xpath("//span[contains(text(), 'Promo��es')]");
	static By myNetwork 				= By.xpath("//span[contains(text(), 'Minha Rede')]");
	static By slider					= By.cssSelector("div[class='slider-frame']");
	static By sendNewMessage 			= By.xpath("//div[starts-with(@class, 'SendMessageCard__Wrapper')]");
	static By footerElements			= By.xpath("//div[starts-with(@class, 'Footerstyles')]");
	
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