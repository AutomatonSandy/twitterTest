package swaglabs_Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtility {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public WebElementUtility() {
		this.driver = SingleWebdriver.getWebDriver();
	}
	public void waitForWebElement(WebElement element) {
	   wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	   wait.until(ExpectedConditions.visibilityOf(element));
	   
	}

}
