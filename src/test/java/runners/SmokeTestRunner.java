package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "features",
		glue="steps"
		)





public class SmokeTestRunner extends AbstractTestNGCucumberTests {

}
