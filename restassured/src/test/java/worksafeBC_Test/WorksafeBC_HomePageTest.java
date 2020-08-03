package worksafeBC_Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import project_utility.BaseClass;
import project_utility.BaseClass_Parallel;
import worksafeBC_Glue.WorkSafeBC_Glue;

public class WorksafeBC_HomePageTest extends BaseClass_Parallel{
	
	WorkSafeBC_Glue worksafeGlue;
	
	@Test
	public void launch_BC_HomePage_firefox() throws IOException {
		setup("firefox");
		worksafeGlue = new WorkSafeBC_Glue(getDriver());
		
	}

	@AfterMethod
	public void teardown() {
		getDriver().quit();
	}
}
