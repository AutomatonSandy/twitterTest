package testngfeatures;

import org.testng.annotations.Test;

public class ClassThree {
	
	@Test(priority=8)
	public void method7() {
		System.out.println("This is method 7");
	}
	
	@Test(priority=9)
	public void methodEight() {
		System.out.println("This is method eight");
	}
	
	@Test(priority=10, expectedExceptions = NumberFormatException.class)
	public void method9()throws NumberFormatException {
		System.out.println("This is method 9");
		throw new NumberFormatException();		
	}

}
