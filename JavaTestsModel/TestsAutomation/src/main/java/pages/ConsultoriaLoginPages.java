package pages;

import org.openqa.selenium.By;
import commonsMethods.CommonsWebDriver;

public class ConsultoriaLoginPages extends CommonsWebDriver {
	
	protected static By userLoginField = By.id("username");
	protected static By userPasswrdField = By.id("password");
	protected static By userSiginButton = By.id("botaoOK");
	protected static By firstAccess = By.xpath("a//[contains(text(), 'Primeiro acesso?')]");
	protected static By forgotPasswrd = By.xpath("a//[contains(text(), 'Esqueci minha senha')]");
	protected static By messageError = By.cssSelector("div[class='alert_login']");
	
}