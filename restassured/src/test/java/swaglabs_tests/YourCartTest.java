package swaglabs_tests;

import org.testng.annotations.Test;

import swaglabs_pages.YourCart;

public class YourCartTest {
	
	YourCart yourCart;
	
	@Test(priority = 3)
	public void validateCartTest() {
		yourCart= new YourCart();
		yourCart.validateCartSizeAndCheckout(2);
	}

}
