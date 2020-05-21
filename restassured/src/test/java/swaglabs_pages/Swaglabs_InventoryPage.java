package swaglabs_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import swaglabs_Utility.SingleWebdriver;

public class Swaglabs_InventoryPage {
	@FindBy(className ="product_label")
	WebElement productLabel;
	
	@FindBy(xpath="//div[@class ='shopping_cart_container' ]//a")
	WebElement cartLink;
	
	WebDriver driver;
	
	public Swaglabs_InventoryPage() {
		driver = SingleWebdriver.getWebDriver();
		System.out.println("driver "+driver);
		PageFactory.initElements(driver, this);
	}
	
	private void validateIndexPage() {
		System.out.println(productLabel.getText());
		Assert.assertEquals(productLabel.getText(),"Products");
		System.out.println("======== Product Page Title Verified ==========================");
	}
	
	private WebElement getItems(String text) {
		String xpath="//div[text() ='"+text+"']/../../following-sibling::div/button";
		WebElement item = driver.findElement(By.xpath(xpath));
		return item;
	}
	
	private void addToCart(String item1) {
		getItems(item1).click();
	}
	
private void clickOnCheckout() {
		cartLink.click();
	}

	public void addItemsToCart(String item1, String item2) {
		System.out.println("inside add items");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("before validate index page");
		validateIndexPage();
		addToCart(item1);
		addToCart(item2);
		cartLink.click();
	}
	
	
}
