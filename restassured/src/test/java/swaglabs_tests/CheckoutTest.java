package swaglabs_tests;

import org.testng.annotations.Test;

import swaglabs_pages.Checkout;

public class CheckoutTest {
	
	Checkout checkout = new Checkout();
	
	@Test(priority = 4)
	public void testCheckoutFunction() {
		checkout.fillInCheckoutPage();
	}

}
