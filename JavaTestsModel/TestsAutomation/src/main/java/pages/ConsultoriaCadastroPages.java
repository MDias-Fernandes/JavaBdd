package pages;

import org.openqa.selenium.By;

public class ConsultoriaCadastroPages {
	
	//static By userLoginField = By.id("username");
	static By newRegister = By.xpath("//span[contains(text(),'Novo cadastro')]");
	static By cpfField = By.id("cpf");
	static By completeName = By.id("name");
	static By genderField = By.cssSelector("div[class='Select-placeholder']");
	static By bornDate = By.id("birthday");
	static By email = By.id("email");
	static By phoneNumber = By.id("phone");
	static By cep = By.id("deliveryAddressZipCode");
	static By unknownCep = By.cssSelector("a[href='http://www.buscacep.correios.com.br/sistemas/buscacep/buscaCepEndereco.cfm']");
	static By nextScreenOne = By.cssSelector("//span[contains(text(),'Voltar')]");
	static By backScreenOne = By.cssSelector("//span[contains(text(),'Próximo')]");
	
}