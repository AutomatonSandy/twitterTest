package swaglabs_tests;

import org.testng.annotations.Test;

import swaglabs_Utility.BaseClass;
import swaglabs_pages.Swaglabs_InventoryPage;

public class AddItemToCart extends BaseClass{
 
	Swaglabs_InventoryPage inventory = new Swaglabs_InventoryPage();
	
	@Test(priority = 2)
	public void addItemsToCart() {
		String item1="Sauce Labs Backpack";
		String item2="Sauce Labs Bike Light";
		inventory.addItemsToCart(item1, item2);
		
	}

}
