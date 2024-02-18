package Hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class MyHooks {

	WebDriver driver;

	@Before
	public void setup() {

		Properties prop = ConfigReader.initializeproperties();
		DriverFactory.initializeBrowser(prop.getProperty("browswer"));
		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
	}
	public void teardown() { 
		driver.quit();

	}

}
