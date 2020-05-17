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
	
	@Test(priority=10)
	public void method9() {
		System.out.println("This is method 9");
	}

}
