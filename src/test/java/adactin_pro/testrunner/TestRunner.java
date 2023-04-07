package adactin_pro.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\Welcome\\eclipse-workspace\\Adactin_Pro\\src\\test\\java\\adactin.feature",
glue = {"adactin_pro.backend","adactin_pro.hooks"}, 
stepNotifications = true , 
dryRun=false, 
monochrome = true,
publish = true,
tags="@TC-104",
plugin= { "pretty","html:target\\report\\adactin_report.html",
		"json:target\\report\\adactin_report.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} 
)

public class TestRunner {
	
	
	
	

}
