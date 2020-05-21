package swaglabs_pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import swaglabs_Utility.SingleWebdriver;
import swaglabs_Utility.WebElementUtility;

public class YourCart {

	@FindBy(xpath="//div[@class ='cart_list']/div/div/a")
	List<WebElement> items;
	
	@FindBy(xpath = "//div[@class='subheader']")
	WebElement yourCartPageLabel;
	
	WebDriver driver;
	WebElementUtility elementUtility = new WebElementUtility();
	public YourCart() {
		this.driver = SingleWebdriver.getWebDriver();
		PageFactory.initElements(driver, this);
	}
	
	private void validatePageLabel() {
		elementUtility.waitForWebElement(yourCartPageLabel);
		String actualPageLabelText = yourCartPageLabel.getText();
		assertEquals(actualPageLabelText, "Your Cart");
		System.out.println("================ Page Verified =========="+actualPageLabelText);
	}
	
	private void validateItemCount(int size) {
		int actualItemsSelected = items.size();
		assertEquals(actualItemsSelected, size);
		System.out.println("========= Total items selected : "+actualItemsSelected+" ============");
		for(int i=0;i<actualItemsSelected;i++) {
			System.out.println("Item "+(i+1)+": "+items.get(i).getText());
		}
	}
	
	public void validateCartSizeAndCheckout(int size) {
		validatePageLabel();
		validateItemCount(size);
	}
}
