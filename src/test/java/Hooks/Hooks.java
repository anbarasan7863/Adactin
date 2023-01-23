package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import fb.com.Baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{

	@Before
	public void BeforeHooks() {
System.out.println("Am Before Hooks");
	}
	
	@After
	public void AfterHooks(Scenario scenario) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png", "screenshot");
		
driver.quit();
	}
	
}
