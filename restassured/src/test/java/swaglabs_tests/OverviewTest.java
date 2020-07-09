package swaglabs_tests;

import org.testng.annotations.Test;

import swaglabs_Utility.BaseClass;
import swaglabs_pages.Overview;

public class OverviewTest extends BaseClass{

	Overview overView = new Overview();
	
	@Test(priority = 5)
	public void testOverviewPage() {
		overView.testingOverviewPage();
	}
}
