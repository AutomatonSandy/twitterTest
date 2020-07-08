package testngfeatures;

import org.testng.annotations.Test;

import project_utility.RetryOnFailure;

public class ClassD {
	
	@Test(priority=8)
	public void method7() {
		System.out.println("This is method 7");
	}
	
//	@Test(retryAnalyzer = RetryOnFailure.class,priority=9)
	@Test
	public void methodEight() {
		System.out.println("This is method eight");
		assert false;
	}
	
	@Test(priority=10, expectedExceptions = NumberFormatException.class)
	public void method9()throws NumberFormatException {
		System.out.println("This is method 9");
		throw new NumberFormatException();		
	}

}
