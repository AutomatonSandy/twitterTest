package testngfeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import project_utility.RetryOnFailure;

public class ClassB {
	
//	@Test(retryAnalyzer = RetryOnFailure.class,priority = 1, groups = {"smoke"})
	@Test
	public void methodOne() {
		System.out.println("This is method one");
			
	}
	
	@Test(priority = 2)
	public void methodTwo() {
		System.out.println("This is method two");
		System.out.println("This is before the soft assertions");
		System.out.println("This is after the soft assertions");
		System.out.println(System.getProperty("property1")+" "+System.getProperty("property2"));	}
	
	@Test(priority = 3, groups = {"smoke"})
	public void methodThree() {

		System.out.println("This is method three");
	}

}
