package worksafeBC_Glue;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import worksafeBC_Pages.WorksafeBC_HomePage;

public class WorkSafeBC_Glue {
	
	WebDriver driver;
	WorksafeBC_HomePage workSafeHome;
	ExtentTest test;
	

	public WorkSafeBC_Glue(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		workSafeHome = new WorksafeBC_HomePage(driver, test);
	}
	
	public void launchAndProcess_HomePage_PopularLink(Hashtable<String, String> dataTable) {
		commonCodeForHomePage(dataTable);
		test.log(Status.INFO, "Proceeding to check the page after clicking on link");
		workSafeHome.check_PageOn_PopularLink_Click(dataTable);
	}

	public void launchAndProcess_HomePage_ServiceByTopic(Hashtable<String, String> dataTable) {
		commonCodeForHomePage(dataTable);
		test.log(Status.INFO, "Proceeding to check the page after clicking on link");
		workSafeHome.check_PageOn_ServiceByTopic(dataTable);
	}
	
	public void launchAndTest_popularLink(Hashtable<String, String> data) {
		test.log(Status.INFO, "Proceeding to check the popular link section");
		workSafeHome.clickOnLink(data);
		test.log(Status.INFO, "Proceeding to check the page after clicking on link");
		workSafeHome.check_PageOn_PopularLink_Click(data);
		workSafeHome.navigateBackToHomePage();
	}
	
	private void commonCodeForHomePage(Hashtable<String, String> dataTable) {
		test.log(Status.INFO, "This is glue code: launch home page" );
		workSafeHome.clickOnAlertCloseButton();
		test.log(Status.INFO, "Was able to click on the alertCloseButton");
		test.log(Status.INFO, "Proceeding to check the popular link section");
		workSafeHome.clickOnLink(dataTable);
	}
}
