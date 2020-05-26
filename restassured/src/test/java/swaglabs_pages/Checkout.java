package swaglabs_pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swaglabs_Utility.SingleWebdriver;
import swaglabs_Utility.WebElementUtility;

public class Checkout {

	@FindBy(xpath = "//div[@class='subheader']")
	WebElement checkOutLabel;

	@FindBy(id = "first-name")
	WebElement firstName;

	@FindBy(id = "last-name")
	WebElement lastName;

	@FindBy(id = "postal-code")
	WebElement postalCode;

	@FindBy(xpath = "//input[@value='CONTINUE']")
	WebElement checkoutButton;

	WebDriver driver;
	WebElementUtility utility = new WebElementUtility();

	public Checkout() {
		driver = SingleWebdriver.getWebDriver();
		PageFactory.initElements(driver, this);

	}

	private void validateCheckoutLabel() {
		utility.waitForWebElement(checkOutLabel);
		String expectedLabelText="Checkout: Your Information";
		assertEquals(checkOutLabel.getText(), expectedLabelText);
	}
	
	private void fillInCheckoutDetails() {
		firstName.sendKeys("Sandipan");
		lastName.sendKeys("Bhattacharjee");
		postalCode.sendKeys("63005");
	}
    
	private void clickOnCheckout() {
		checkoutButton.click();
	}
	
	public void fillInCheckoutPage() {
		validateCheckoutLabel();
		fillInCheckoutDetails();
		clickOnCheckout();
	}
}
