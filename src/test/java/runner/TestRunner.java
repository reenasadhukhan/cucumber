package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/feature",
		glue="cucumberStepFile",
		plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" },
		dryRun=true,
        monochrome = true
        )
public class TestRunner {

}
