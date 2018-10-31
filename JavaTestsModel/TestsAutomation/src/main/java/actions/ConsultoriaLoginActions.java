package actions;


import commonsMethods.CommonsWebDriver;
import pages.ConsultoriaLoginPages;

public class ConsultoriaLoginActions extends ConsultoriaLoginPages {

	public static boolean validateErrorInvalidCredentials() {
		try {
			CommonsWebDriver.DRIVER.findElement(messageError).isDisplayed();
			CommonsWebDriver.takeScreenShot(1, messageError);
			return true;
		} catch (Exception e) {
			CommonsWebDriver.takeScreenShot(1, null);
			CommonsWebDriver.closeWindow();
			throw e;
		}
	}
	
	public static void setLogin(String userName) {
		CommonsWebDriver.sleepAndFindElement(5, userLoginField).sendKeys(userName);
	}
	
	public static void setPassword(String password) {
		CommonsWebDriver.sleepAndFindElement(1, userPasswrdField).sendKeys(password);
		CommonsWebDriver.takeScreenShot(1, userPasswrdField);
	}
	
	public static void clickLogin() {
		CommonsWebDriver.sleepAndFindElement(1, userSiginButton).click();
	}
	
	public static void clickFirstAccess() {
		CommonsWebDriver.sleepAndFindElement(1, firstAccess).click();
	}
	
	public static void clickForgotPassword() {
		CommonsWebDriver.sleepAndFindElement(5, forgotPasswrd).click();
	}
	
}