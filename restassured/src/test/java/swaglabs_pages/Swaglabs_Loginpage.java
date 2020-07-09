package swaglabs_pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import swaglabs_Utility.SingleWebdriver;

public class Swaglabs_Loginpage {
	@FindBy(id = "user-name")
	WebElement userName;

	@FindBy(id = "password")
	WebElement passWord;

	@FindBy(xpath = "//input[@value='LOGIN']")
	WebElement loginButton;

	WebDriver driver;

	public Swaglabs_Loginpage() {
		System.out.println("login page constructor");
		driver = SingleWebdriver.getWebDriver();
		System.out.println(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void launch_and_Maximize(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void fillUserName_and_Login(String userNameValue, String passWordValue) {
		Assert.assertTrue(driver.getTitle().equals("Swag Labs"));
		userName.sendKeys(userNameValue);
		passWord.sendKeys(passWordValue);
		loginButton.click();
	}
	//dummy commit
	
}
