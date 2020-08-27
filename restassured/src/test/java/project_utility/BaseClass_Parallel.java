package project_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class BaseClass_Parallel {

	public static ThreadLocal<RemoteWebDriver> threadDriver = new ThreadLocal<RemoteWebDriver>();
	public FileInputStream fileInputStream;
	public Properties property = new Properties();
	public RemoteWebDriver driver = null;
	public static ExtentReports report = ExtentManager.getExtentInstance();
	public static ExtentTest extnt_test;
	public static ThreadLocal<ExtentTest> thrd_ext_test = new ThreadLocal<ExtentTest>();

	public WebDriver getDriver() {
		return threadDriver.get();
	}

	public void setWebDriver(RemoteWebDriver driver) {
		threadDriver.set(driver);
	}

	public void setThreadSafe_Extent(ExtentTest extentTest) {
		thrd_ext_test.set(extentTest);
	}
	public static ExtentTest getThreadSafeExtentTest() {
		return thrd_ext_test.get();
	}
	
	
	public void setup(String browser) {
		try {
			getThreadSafeExtentTest().log(Status.INFO, "Opening instance of "+browser);
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
	   getThreadSafeExtentTest().log(Status.INFO, "Opening url "+url);
		getDriver().get(url);
	}

	
}
