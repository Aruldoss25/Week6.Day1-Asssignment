package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features/CreateLead.feature", glue = "steps", publish = true, monochrome = true)
public class Output extends AbstractTestNGCucumberTests {
	
	}
