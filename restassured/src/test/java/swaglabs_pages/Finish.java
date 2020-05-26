package swaglabs_pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swaglabs_Utility.SingleWebdriver;
import swaglabs_Utility.WebElementUtility;

public class Finish {
	@FindBy(xpath="//div[@class='subheader']")
	WebElement finishLabel;
	
	@FindBy(xpath="//h2[@class='complete-header']")
	WebElement thanksHeader;
	
	WebElementUtility utility = new WebElementUtility();
	WebDriver driver;
	
	public Finish() {
		driver = SingleWebdriver.getWebDriver();
		PageFactory.initElements(driver, this);
	}
	public void finishTest() {
		utility.waitForWebElement(finishLabel);
		assertEquals(finishLabel.getText(), "Finish");
		assertEquals(thanksHeader.getText(), "THANK YOU FOR YOUR ORDER");
	}

}
