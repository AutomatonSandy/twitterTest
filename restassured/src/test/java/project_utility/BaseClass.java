package project_utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import swaglabs_Utility.SingleWebdriver;

public class BaseClass {	
	 public static WebDriver driver;
	
	@BeforeSuite 
	public void setUp() {
		driver = SingleWebdriver.getWebDriver();
	}
    
	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		System.out.println("Quitting webdriver");
		driver.quit();
	}
}
