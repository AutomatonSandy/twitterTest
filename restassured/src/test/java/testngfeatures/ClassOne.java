package testngfeatures;

import org.testng.annotations.Test;

public class ClassOne {
	
	@Test(priority = 1, groups = {"smoke"})
	public void methodOne() {
		System.out.println("This is method one");
	}
	
	@Test(priority = 2)
	public void methodTwo() {
		System.out.println("This is method two");
	}
	
	@Test(priority = 3, groups = {"smoke"})
	public void methodThree() {
		System.out.println("This is method three");
	}

}
