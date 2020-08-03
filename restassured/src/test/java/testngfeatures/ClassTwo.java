package testngfeatures;

import static org.testng.Assert.assertTrue;

import java.util.Hashtable;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import gorest_utility.DataProviderClass;
import project_utility.ExtentManager;

@Listeners(ExtentITestListenerClassAdapter.class)
public class ClassTwo {
	
	ExtentReports extent;
	
	@Test(priority=4)
	public void methodFour() {
		System.out.println("This is method Four");
		assertTrue(true);
	}
	
	@Test(priority=5,groups = {"smoke"}, dataProvider = "happypath_data", dataProviderClass = DataProviderClass.class)
	public void methodFive(Hashtable<String, String> data) {
		System.out.println("This is method five");
		System.out.println(data.get("Browser"));
		assertTrue(true);
	}
	
	@Test(priority=6, dataProvider = "happypath_data", dataProviderClass = DataProviderClass.class)
	public void methodSix(Hashtable<String, String> testDataTable) {
		System.out.println("This is method six");
		assertTrue(true);
		
		System.out.println(testDataTable.get("FirstName")+" ---------- "+testDataTable.get("LastName")+" ------------ "+
testDataTable.get("Email")+" -------------"+testDataTable.get("Gender"));
	}

}
