package testngfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ClassOne {
	
	@Test(priority = 1, groups = {"smoke"})
	public void methodOne() {
//		int a = 10, b=20;
//		Assert.assertEquals(a, b);	
		System.out.println("This is method one");
			
	}
	
	@Test(priority = 2)
	public void methodTwo() {
		int c =10, d =20;
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(c, d);		
		System.out.println("This is method two");
		System.out.println("This is before the soft assertions");
		soft.assertAll("Check for failures");
		System.out.println("This is after the soft assertions");
	}
	
	@Test(priority = 3, groups = {"smoke"})
	public void methodThree() {
		System.out.println("This is method three");
	}

}
