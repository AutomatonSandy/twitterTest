package swaglabs_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

public class SingleWebdriver {

	private static WebDriver driver = null;

	private SingleWebdriver(String browser) {
		String commonPath=  System.getProperty("user.dir") + "//src//test//resources//";
		String chromePath = commonPath+"chromedriver.exe";
		String firefoxPath = commonPath+"geckodriver.exe";
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromePath);
			ChromeOptions capability = new ChromeOptions();
			capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			SingleWebdriver.driver = new ChromeDriver(capability);
		} else {
			System.out.println(firefoxPath);
			System.setProperty("webdriver.gecko.driver", firefoxPath);
			FirefoxOptions capability = new FirefoxOptions();
			capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			SingleWebdriver.driver = new FirefoxDriver(capability);
			
		}
	}
	
	public static WebDriver getWebDriver() {
		String browser=System.getProperty("browser");
		if (driver == null) {
			new SingleWebdriver(browser);
		}
		return driver;
	}

}
