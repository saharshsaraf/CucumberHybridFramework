package Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.*;

public class DriverFactory {
 static WebDriver driver =null;
	public static WebDriver initializeBrowser(String browserName) {
		
		if(browserName.equals("chrome")) {
			 driver = new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equals("edge")) {
			 driver = new EdgeDriver();
		}else if(browserName.equals("safari")){
			 driver = new SafariDriver();
		}
		return driver;
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
}
