package swaglabs_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import swaglabs_Utility.SingleWebdriver;

public class Swaglabs_Loginpage {
	@FindBy(id = "user-name")
	WebElement userName;

	@FindBy(id = "password")
	WebElement passWord;

	@FindBy(xpath = "//input[@value='LOGIN']")
	WebElement loginButton;

	WebDriver driver;
	SingleWebdriver singleTon;

	public Swaglabs_Loginpage() {
		driver = singleTon.getWebDriver("chrome");
		PageFactory.initElements(driver, this);
	}
	
	
	public void launch_and_Maximize() {
		String url = "https://www.saucedemo.com/index.html";
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void fillUserName_and_Login() {
		userName.sendKeys("standard_user");
		passWord.sendKeys("secret_sauce");
		loginButton.click();
	}
	//dummy commit
	
}
