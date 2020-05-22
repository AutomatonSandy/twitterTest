package swaglabs_Utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class BaseClass {	
	 WebDriver driver;
	
	public BaseClass() {
		this.driver = SingleWebdriver.getWebDriver();
	}
    
	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		System.out.println("Quitting webdriver");
		driver.quit();
	}
}
