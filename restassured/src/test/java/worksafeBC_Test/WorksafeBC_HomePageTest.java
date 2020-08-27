package worksafeBC_Test;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import project_utility.BaseClass_Parallel;
import project_utility.DataProviderClass;
import project_utility.ExcelReaderUtility;
import worksafeBC_Glue.WorkSafeBC_Glue;

public class WorksafeBC_HomePageTest extends BaseClass_Parallel {

	WorkSafeBC_Glue worksafeGlue;
	ExcelReaderUtility ExcelReaderUtility;

	@Test(dataProvider = "homePage_PopularLink", dataProviderClass = DataProviderClass.class)
	public void Test_Work_Safe_BC_HomePage(Hashtable<String, String> data) throws IOException {
		extnt_test = report.createTest("Test_Work_Safe_BC_HomePage");
		setThreadSafe_Extent(extnt_test);
		setup(data.get("Browser"));
		worksafeGlue = new WorkSafeBC_Glue(getDriver(), getThreadSafeExtentTest());
		worksafeGlue.launchAndProcess_HomePage_PopularLink(data);

	}

	@AfterMethod
	public void teardown() {
		if (report != null) {
			report.flush();
		}
		getDriver().quit();
	}
}
