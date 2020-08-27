package testngfeatures;

import org.testng.annotations.Test;

import project_utility.DataProviderClass;
import project_utility.RetryOnFailure;

public class ClassC {
	
//	@Test(retryAnalyzer = RetryOnFailure.class,priority=4)
	@Test
	public void methodFour() {
		System.out.println("This is method Four");
		assert false;
	}
	
	@Test(priority=5,groups = {"smoke"}, dataProvider = "happypath_data", dataProviderClass = DataProviderClass.class)
	public void methodFive(int data) {
		System.out.println("This is method five");
		System.out.println(data);
	}
	
	@Test(priority=6, dataProvider = "happypath_data", dataProviderClass = DataProviderClass.class)
	public void methodSix(String fname, String lname, String	email, String gender) {
		System.out.println("This is method six");
		System.out.println(fname+" ---------- "+lname+" ------------ "+email+" -------------"+gender);
	}

}
