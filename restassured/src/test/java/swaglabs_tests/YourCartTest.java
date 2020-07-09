package swaglabs_tests;

import org.testng.annotations.Test;

import project_utility.BaseClass;
import swaglabs_pages.YourCart;

public class YourCartTest extends BaseClass{
	
	YourCart yourCart;
	
	@Test(priority = 3)
	public void validateCartTest() {
		yourCart= new YourCart();
		yourCart.validateCartSizeAndCheckout(2);
	}

}
