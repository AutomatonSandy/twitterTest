package swaglabs_pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swaglabs_Utility.SingleWebdriver;
import swaglabs_Utility.WebElementUtility;

public class Overview {
	
	@FindBy(xpath="//div[@class='subheader']")
	WebElement overviewLabel;
	
	@FindBy(xpath="//div[@class='summary_value_label'][1]")
	WebElement paymentInformation;
	
	@FindBy(xpath="//div[@class='summary_value_label'][2]")
	WebElement shippingInformation;
	
	@FindBy(xpath="//div[@class='summary_subtotal_label']")
	WebElement itemTotal;
	
	@FindBy(xpath="//div[@class='summary_tax_label']")
	WebElement totalTax;
	
	@FindBy(xpath="//div[@class='summary_total_label']")
	WebElement total;
	
	@FindBy(xpath="//a[@class='btn_action cart_button']")
	WebElement finishButton;
	
	WebDriver driver;
	WebElementUtility utility= new WebElementUtility();
	
	public Overview() {
		driver = SingleWebdriver.getWebDriver();
		PageFactory.initElements(driver, this);
	}
	
	private void validateOverviewPage() {
	String expectedOverviewLabel="Checkout: Overview";
	utility.waitForWebElement(overviewLabel);
	assertTrue(expectedOverviewLabel.equals(overviewLabel.getText()));
		
	}
	private void getDetailsFromPage() {
		String paymentInformationText=paymentInformation.getText();
		String shippingInfoText= shippingInformation.getText();
		String itemTotalValue=itemTotal.getText();
		String taxValue=totalTax.getText();
		String totalValue = total.getText();
		
		System.out.println(paymentInformationText);
		System.out.println(shippingInfoText);
		System.out.println(itemTotalValue);
		System.out.println(taxValue);
		System.out.println(totalValue);
		
	}
	private void clickOnFinish() {
		finishButton.click();
	}
	public void testingOverviewPage() {
		validateOverviewPage();
		getDetailsFromPage();
		clickOnFinish();
	}
}
