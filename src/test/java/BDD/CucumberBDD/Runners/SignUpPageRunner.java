package BDD.CucumberBDD.Runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/BDD/CucumberBDD/Features/SignPage.feature", glue={"BDD.CucumberBDD.stepDefinitions","BDD.CucumberBDD.testBase"},
monochrome = true, dryRun = false,
plugin= { "pretty","json:target/MyReports/report.json",
		"html:target/cucumber-reports/htmlreport.html"}


		)
public class SignUpPageRunner {

	
}
