package project_utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import swaglabs_Utility.SingleWebdriver;
import worksafeBC_Pages.WorksafeBC_HomePage;

public class BaseClass {	
	 public static WebDriver driver;
	 public static ExtentReports report = ExtentManager.getExtentInstance();
	 public static ExtentTest extnt_test;

	@BeforeSuite 
	public void setUp() {
		System.setProperty("browser", "chrome");
		driver = SingleWebdriver.getWebDriver();
		driver.get("https://www.worksafebc.com/en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.className("fa-times")).click();
	}
	
	
    
	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		if (report != null) {
//			report.removeTest("Launch BC HomePage Firefox");
		report.flush();
	}
		System.out.println("Quitting webdriver");
		driver.quit();
	}
	
}
