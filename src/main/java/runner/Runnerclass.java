package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefolder/example.feature",glue="Stepdefinition",
plugin="html:c:\\cucumber-html-report")//,tags={"@category,@sub-category"})

public class Runnerclass {
	
	

}
