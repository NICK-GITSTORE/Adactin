package adactin_pro.hooks;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import adactin_pro.base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Base {
	
	@Before
	public void B_Hooks() {
		System.out.println("INITIALIZATION");

	}
	
	@After
	public void A_hooks(Scenario sc) {
//		if (sc.isFailed()) {
		TakesScreenshot ss = (TakesScreenshot)nv;
		byte[] ssb = ss.getScreenshotAs(OutputType.BYTES);
		sc.attach(ssb,"image/png","screenimage");
//		}
		
		
		System.out.println("THE END");
		
		

	}

	
}
