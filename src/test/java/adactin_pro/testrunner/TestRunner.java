package adactin_pro.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Welcome\\eclipse-workspace\\Adactin_Pro\\src\\test\\java\\adactin.feature",
glue = "adactin_pro.backend" ,tags="@TC-104", stepNotifications = true , dryRun=false,
plugin="pretty")
public class TestRunner {
	
	
	

}
