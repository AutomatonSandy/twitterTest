package worksafeBC_Glue;

import org.openqa.selenium.WebDriver;

import worksafeBC_Pages.WorksafeBC_HomePage;

public class WorkSafeBC_Glue {
	
	WebDriver driver;
	WorksafeBC_HomePage workSafeHome;

	public WorkSafeBC_Glue(WebDriver driver) {
		this.driver = driver;
		workSafeHome = new WorksafeBC_HomePage(driver);
	}
	
	public void launchAndProcess_HomePage() {
//		workSafeHome.launchWorkSafeBC();
		workSafeHome.clickOnAlertCloseButton();
	}

}
