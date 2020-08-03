package project_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import gherkin.deps.net.iharder.Base64.InputStream;

public class BaseClass_Parallel {

	public static ThreadLocal<RemoteWebDriver> threadDriver = new ThreadLocal<RemoteWebDriver>();
	public FileInputStream fileInputStream;
	public Properties property = new Properties();
	public RemoteWebDriver driver = null;

	public WebDriver getDriver() {
		return threadDriver.get();
	}

	public void setWebDriver(RemoteWebDriver driver) {
		threadDriver.set(driver);
	}

	public void setup(String browser) {
		try {
			openBrowser(browser);
			openUrl_In_Browser();
		} catch (IOException e) {
		      System.out.println(" Check code there are error in property file path or browser options");
		}
		
	}
	
	private void openBrowser(String browser) throws IOException {
		DesiredCapabilities capability = new DesiredCapabilities();
		fileInputStream = new FileInputStream(Constants.configFilePath);
		property.load(fileInputStream);
		
		if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			capability.setBrowserName("Firefox");
			capability.setPlatform(Platform.ANY);
			capability.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
		} else if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			capability.setBrowserName("Chrome");
			capability.setPlatform(Platform.ANY);
			capability.setCapability(ChromeOptions.CAPABILITY, options);
		}
		driver = new RemoteWebDriver(new URL("http://192.168.1.6:4444/wd/hub"), capability);
		setWebDriver(driver);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();
	}
	
	private void openUrl_In_Browser() {
	    String env = System.getProperty("env");
	    env="dev";
	    String url = null;
	    if(env.equalsIgnoreCase("dev")) {
	       url=property.getProperty("dev.url");
	    }
		getDriver().get(url);
	}

	
}
