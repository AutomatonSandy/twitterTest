package worksafeBC_Pages;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import project_utility.WebElementUtility_Parallel;
import swaglabs_Utility.WebElementUtility;

public class WorksafeBC_HomePage {

	private WebDriver driver;
	private WebElementUtility_Parallel webElementUtility;
//	private final String url = "https://www.worksafebc.com/en";
//	private String browser;
	ExtentTest test;

	@FindBy(className = "fa-times")
	WebElement crossMarkOnAlert;
	
	@FindBy(xpath ="//h3[@data-mh='callout_title']")
	WebElement homePageTitle;

	public WorksafeBC_HomePage(WebDriver driver, ExtentTest test) {
//		this.browser = browser;
		this.driver = driver;
		this.test = test;
		webElementUtility = new WebElementUtility_Parallel(driver);
		PageFactory.initElements(driver, this);

	}

	public void clickOnAlertCloseButton() {
		webElementUtility.waitForWebElement(crossMarkOnAlert);
		test.log(Status.INFO, " Preparing to click on the cross mark on the Covid alert");
		crossMarkOnAlert.click();
		test.log(Status.INFO, " Clicked on the cross mark on the Covid alert");
	}

	public void clickOnLink(Hashtable<String, String> data) {
		WebElement popularSectionLink = driver.findElement(By.linkText(data.get("Links")));
		test.log(Status.INFO, " Ready to click on the link " + data.get("Links"));
		webElementUtility.waitForWebElement(popularSectionLink);
		try {
			popularSectionLink.click();
		} catch (Exception e) {
			test.log(Status.FAIL, " The test failed " + e.getMessage());
		}
	}

	public void check_PageOn_PopularLink_Click(Hashtable<String, String> data) {
		WebElement pageHeader = driver.findElement(By.xpath("//h1[@class ='page_title']"));
		commonPageCheckCode(data, pageHeader);
	}
	
	public void navigateBackToHomePage() {
		driver.navigate().back();
		webElementUtility.waitForWebElement(homePageTitle);
		test.log(Status.INFO, "We are getting "+homePageTitle.getText()+" as page title");
		Assert.assertTrue(homePageTitle.getText().trim().equals("Popular links"));
	}

	public void check_PageOn_ServiceByTopic(Hashtable<String, String> data) {

		if (data.get("Links").equals("Forms & Resources")) {
			WebElement element = driver.findElement(By.xpath("//h1[@class ='page_title']"));
			commonPageCheckCode(data, element);
		} else {
			String pageUrl = driver.getCurrentUrl();
			String[] urlTokens = pageUrl.split("/");
			int length = urlTokens.length;
			String actualPageUrlText = urlTokens[length - 1];
			String expectedPageUrlTitle = data.get("Page");
			test.log(Status.INFO,"Page Url text is " + actualPageUrlText + " and Expected  page url is " + expectedPageUrlTitle);
			Assert.assertEquals(actualPageUrlText, expectedPageUrlTitle);
		}

	}

	private void commonPageCheckCode(Hashtable<String, String> data, WebElement pageHeader) {
		webElementUtility.waitForWebElement(pageHeader);
		String pageTitleText = pageHeader.getText();
		String expectedPageTitle = data.get("Page");
		test.log(Status.INFO, "Page Header text is " + pageTitleText + " and Expected  text is " + expectedPageTitle);
		Assert.assertEquals(pageTitleText, expectedPageTitle);
	}

}
