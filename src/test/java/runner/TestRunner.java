package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/feature",
		glue="cucumberStepFile"	,	
		//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		format= {"pretty", "html:test_report", "json:json_repot/cucumber.json","junit:junit_xml_report/cucumber.xml"},
        monochrome = true
                )

public class TestRunner {

}
