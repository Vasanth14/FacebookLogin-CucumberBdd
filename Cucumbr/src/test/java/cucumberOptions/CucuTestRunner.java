package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src//test//java//Feature//Log.feature"},
glue="stepDefenitions",monochrome=true)
public class CucuTestRunner extends AbstractTestNGCucumberTests {
	
	

}
