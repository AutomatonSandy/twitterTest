package swaglabs_tests;

import org.testng.annotations.Test;

import swaglabs_pages.Swaglabs_InventoryPage;

public class AddItemToCart {
 
	Swaglabs_InventoryPage inventory = new Swaglabs_InventoryPage();
	
	@Test(priority = 2)
	public void addItemsToCart() {
		inventory.addItemsToCart();
		
	}

}
