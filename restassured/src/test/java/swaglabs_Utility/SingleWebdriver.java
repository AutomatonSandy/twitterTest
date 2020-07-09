package swaglabs_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class SingleWebdriver {

	private static WebDriver driver = null;

	private SingleWebdriver(String browser) {
		String chromePath = System.getProperty("user.dir") + "//src//test//resources//chromedriver.exe";
		String firefoxPath = "Just a dummy path";
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromePath);
			ChromeOptions capability = new ChromeOptions();
			capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			this.driver = new ChromeDriver(capability);
		} else {
			System.out.println(firefoxPath);
			System.setProperty("webdriver.chrome.driver", chromePath);
			this.driver = new ChromeDriver();
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
