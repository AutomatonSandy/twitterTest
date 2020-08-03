package project_utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtility_Parallel {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public WebElementUtility_Parallel(WebDriver driver) {
		this.driver = driver;
	}
	public void waitForWebElement(WebElement element) {
	   wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	   wait.until(ExpectedConditions.visibilityOf(element));
	   
	}

}
