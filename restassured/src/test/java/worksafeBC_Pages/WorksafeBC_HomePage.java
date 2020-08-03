package worksafeBC_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_utility.WebElementUtility_Parallel;

public class WorksafeBC_HomePage {
	
	private WebDriver driver;
	private WebElementUtility_Parallel webElementUtility;
//	private final String url = "https://www.worksafebc.com/en";
//	private String browser;
	
	@FindBy(className = "fa-times")
	WebElement crossMarkOnAlert;
	
	public WorksafeBC_HomePage(WebDriver driver) {
//		this.browser = browser;
		this.driver = driver;
		webElementUtility = new WebElementUtility_Parallel(driver);	
		PageFactory.initElements(driver, this);
		
	}
	
//	public void launchWorkSafeBC() {
//		driver.get(url);
//		driver.manage().window().maximize();
//	}
	
	public void clickOnAlertCloseButton() {
		webElementUtility.waitForWebElement(crossMarkOnAlert);
		crossMarkOnAlert.click();
	}

}
