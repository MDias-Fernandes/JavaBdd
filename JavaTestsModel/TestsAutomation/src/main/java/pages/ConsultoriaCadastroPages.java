package pages;

import org.openqa.selenium.By;
import commonsMethods.CommonsWebDriver;

public class ConsultoriaCadastroPages extends CommonsWebDriver {
	
	protected static By newRegister = By.xpath("//span[contains(text(),'Novo cadastro')]");
	protected static By cpfField = By.id("cpf");
	protected static By completeName = By.id("name");
	protected static By genderField = By.cssSelector("div[class='Select-placeholder']");
	protected static By bornDate = By.id("birthday");
	protected static By email = By.id("email");
	protected static By phoneNumber = By.id("phone");
	protected static By cep = By.id("deliveryAddressZipCode");
	protected static By unknownCep = By.cssSelector("a[href='http://www.buscacep.correios.com.br/sistemas/buscacep/buscaCepEndereco.cfm']");
	protected static By nextScreenOne = By.cssSelector("//span[contains(text(),'Voltar')]");
	protected static By backScreenOne = By.cssSelector("//span[contains(text(),'Próximo')]");
	
}