package testngfeatures;

import org.testng.annotations.Test;

public class ClassTwo {
	
	@Test(priority=4)
	public void methodFour() {
		System.out.println("This is method Four");
	}
	
	@Test(priority=5,groups = {"smoke"})
	public void methodFive() {
		System.out.println("This is method five");
	}
	
	@Test(priority=6)
	public void methodSix() {
		System.out.println("This is method six");
	}

}
