package commonsMethods;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonsWebDriver {
	
	protected static ChromeDriver DRIVER;
	
	protected static void getUrl(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		//options.addArguments("headless");
		//options.addArguments("window-size=1200x600");
		DRIVER = new ChromeDriver(options);
		DRIVER.get(url);
	}
	
	protected static void closeWindow() {
		DRIVER.quit();
	}
	
	
	
	//CommonsMethods
	//execute a JS script
	protected static void executeJsScript(String scriptToBeExecuted) {
		if (DRIVER instanceof JavascriptExecutor) {
		    ((JavascriptExecutor)DRIVER).executeScript(scriptToBeExecuted);
		} else {
		    throw new IllegalStateException("O DRIVER UTILIZADO NÃO UTILIZA JAVASCRIPT!!!");
		}
	}
	
	//Sleep a while and find ONLY ONE element
	protected static WebElement sleepAndFindElement(int timeForWait, By checkElementVisibility) {
		int counter = 1;
		WebElement elementFinded = null;
		while (counter <= timeForWait) {
			try {
				TimeUnit.SECONDS.sleep(1);
				elementFinded = DRIVER.findElement(checkElementVisibility);
				System.out.println("ELEMENTO ("+ checkElementVisibility.toString() +") ENCONTRADO NA TENTATIVA: " + counter);
				break;
			} catch (Exception error) {
				System.out.println("========> ELEMENTO ("+ checkElementVisibility.toString() +") NÃO ENCONTRADO NA TENTATIVA: " + counter);
				error.getMessage();
				counter += 1;
			}
		}
		if (counter > timeForWait) {
			System.out.println("========> TIMEOUT NA LOCALIZAÇÃO DO ELEMENTO ("+ checkElementVisibility.toString() + ")");
			takeScreenShot(1, null);
			closeWindow();
			TimeoutException timeOut = new TimeoutException();
			throw timeOut;
		} else {
			return elementFinded;
		}
	}

	//Sleep a while and find AN ARRAY of elements
	protected static List<WebElement> sleepAndFindArrayOfElements(int timeForWait, By checkElementsVisibility) {
		int counter = 1;
		List<WebElement> elementsFinded = null;
		while (counter <= timeForWait) {
			try {
				TimeUnit.SECONDS.sleep(1);
				elementsFinded = DRIVER.findElements(checkElementsVisibility);
				System.out.println("ELEMENTOS ("+ checkElementsVisibility.toString() +") ENCONTRADOS NA TENTATIVA: " + counter);
				break;
			} catch (Exception error) {
				System.out.println("========> ELEMENTOS ("+ checkElementsVisibility.toString() +") NÃO ENCONTRADOS NA TENTATIVA: " + counter);
				error.printStackTrace();
				counter += 1;
			}
		}
		if (counter > timeForWait) {
			System.out.println("========> TIMEOUT NA LOCALIZAÇÃO DOS ELEMENTOS ("+ checkElementsVisibility.toString() +")");
			takeScreenShot(1, null);
			closeWindow();
			TimeoutException timeOut = new TimeoutException();
			throw timeOut;
		} else {
			for ( WebElement allFinded: elementsFinded) {
				System.out.println("ELEMENTOS " + allFinded.toString() + " COM VISIBILIDADE: " + allFinded.isDisplayed());
		    }
			return elementsFinded;
		}
	}
	
	//Take a screenshot of the screen
	protected static void takeScreenShot(int timeForWait, By elementInstanceBy) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		DateTime dateTime = DateTime.now();
		String dateOfScreenshot = dateFormat.format(dateTime.toDate());
		
		try {
			TimeUnit.SECONDS.sleep(timeForWait);
			
			if (elementInstanceBy == null) {
				TakesScreenshot ts = (TakesScreenshot) DRIVER;
			    File source = ts.getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(source, new File("../ScreenshotsElementByNull/" + dateOfScreenshot + ".png"));
			    System.out.println("========> SCREENSHOT NA PÁGINA REALIZADO COM SUCESSO!!!!! AVALIAR POSSÍVEL ERRO!!!!!");
			} else {
			
			WebElement elementToBePrinted = DRIVER.findElement(elementInstanceBy);
			((JavascriptExecutor)DRIVER).executeScript("arguments[0].scrollIntoView();", elementToBePrinted);
			
			TakesScreenshot ts = (TakesScreenshot) DRIVER;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(source, new File("../Screenshots/" + dateOfScreenshot + ".png"));
		    System.out.println("--------> SCREENSHOT NA PÁGINA REALIZADO COM SUCESSO!");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("EXCEÇÃO AO REALIZAR UM SCREENSHOT DA PÁGINA");
		}
	}

}