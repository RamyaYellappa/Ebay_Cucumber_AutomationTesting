package StepDefinitions;



import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\WIN10 PRO 22H2\\eclipse-workspace\\Assignment_Cucumber\\src\\test\\resources\\Features\\", 
glue={"StepDefinitions"},
monochrome = true ,
plugin = {"json:target/cucumber.json",
		  "html:target\\HtmlReports",
		  "json:target\\JsonReport",
		  "junit:target\\XMLreport"
		  }
//tags="@smoketest"
)


public class TestRunner {

}

