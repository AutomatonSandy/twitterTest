package swaglabs_Utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class Cleanup {	
	 WebDriver driver;
	
	public Cleanup() {
		this.driver = SingleWebdriver.getWebDriver();
	}
    
	@AfterSuite
	public void tearDown() {
		System.out.println("Quitting webdriver");
		driver.quit();
	}
}
