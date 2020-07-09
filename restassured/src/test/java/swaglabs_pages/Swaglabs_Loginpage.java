package swaglabs_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		userName.sendKeys(userNameValue);
		passWord.sendKeys(passWordValue);
		loginButton.click();
	}
	//dummy commit
	
}
