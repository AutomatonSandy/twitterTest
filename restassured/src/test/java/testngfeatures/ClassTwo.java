package testngfeatures;

import static org.testng.Assert.assertTrue;

import java.util.Hashtable;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import project_utility.BaseClass_Parallel;
import project_utility.DataProviderClass;

public class ClassTwo  extends BaseClass_Parallel{
	
	
	@Test(priority=4)
	public void methodFour() {
		extnt_test=report.createTest(" Method Four");
		extnt_test.log(Status.INFO, "This is method four");
		System.out.println("This is method Four");
		assertTrue(true);
		
	}
	
	@Test(priority=5,groups = {"smoke"}, dataProvider = "happypath_data", dataProviderClass = DataProviderClass.class)
	public void methodFive(Hashtable<String, String> data) {
		extnt_test=report.createTest(" Method Five");
		System.out.println("This is method five");
		extnt_test.log(Status.INFO, data.get("Browser"));
		assertTrue(true);
		
	}
	
	@Test(priority=6, dataProvider = "happypath_data", dataProviderClass = DataProviderClass.class)
	public void methodSix(Hashtable<String, String> testDataTable) {
		extnt_test=report.createTest(" Method Six");
		System.out.println("This is method six");
		assertTrue(true);
		
		extnt_test.log(Status.INFO, testDataTable.get("FirstName")+" ---------- "+testDataTable.get("LastName")+" ------------ "+
testDataTable.get("Email")+" -------------"+testDataTable.get("Gender"));
		
	}

	@AfterClass
	public void tearDown() {
		report.flush();
	}

}
