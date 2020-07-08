package testngfeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ClassOne {
	
	private int a;
	private int b;
	
	public ClassOne(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	@Test(priority = 1, groups = {"smoke"})
	public void methodOne() {
//		int a = 10, b=20;
//		Assert.assertEquals(a, b);	
		System.out.println(a+b);
		this.a=a+30;
		System.out.println(System.getProperty("property1")+" "+System.getProperty("property2"));
		System.out.println("This is method one");
			
	}
	
	@Test(priority = 2)
	public void methodTwo() {
		int c =20, d =20;
		
		System.out.println(a);
		System.out.println(b);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(c, d);		
		System.out.println("This is method two");
		System.out.println("This is before the soft assertions");
		soft.assertAll("Check for failures");
		System.out.println("This is after the soft assertions");
		System.out.println(System.getProperty("property1")+" "+System.getProperty("property2"));
	}
	
	@Test(priority = 3, groups = {"smoke"})
	public void methodThree() {
		System.out.println(a+b);
		System.out.println("This is method three");
	}

}
