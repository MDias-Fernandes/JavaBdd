package pages;

import org.openqa.selenium.By;
import commonsMethods.CommonsWebDriver;

public class ConsultoriaTelaPrincipalPages extends CommonsWebDriver {
	
	protected static By profileIcon 	= By.xpath("//div[starts-with(@class, 'HeaderTop__AvatarLink')]");
	protected static By logoNatura 		= By.cssSelector("img[title='Natura']");
	protected static By homeText 		= By.xpath("//div[starts-with(@class,'HeaderTop__Section')][contains(text(), 'Home')]");
	protected static By newRegister 	= By.xpath("//span[contains(text(), 'Novo cadastro')]");
	protected static By newOrder 		= By.xpath("//span[contains(text(), 'Novo Pedido')]");
	protected static By indicators 		= By.xpath("//span[contains(text(), 'Indicadores')]");
	protected static By promotions 		= By.xpath("//span[contains(text(), 'Promoções')]");
	protected static By myNetwork 		= By.xpath("//span[contains(text(), 'Minha Rede')]");
	protected static By slider			= By.cssSelector("div[class='slider-frame']");
	protected static By sendNewMessage	= By.xpath("//div[starts-with(@class, 'SendMessageCard__Wrapper')]");
	protected static By footerElements	= By.xpath("//div[starts-with(@class, 'Footerstyles')]");
	
}