package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "features"

,glue = 	{	
			"stepsDefinition",
			"commonsMethods"
	   		}

,tags =		{	
			//"@LoginConsultoria"
			//"@CadastroConsultoria"
			"@TelaConsultoria","@MenuMeusCadastros", "@SugeridasParaInicio"
			}

,plugin =	{
			"html:target/cucumber-reports"
			}

,monochrome = true
)

public class TestRunner {
	
}