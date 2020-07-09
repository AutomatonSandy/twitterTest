package swaglabs_tests;

import org.testng.annotations.Test;


import swaglabs_pages.Overview;

public class OverviewTest extends project_utility.BaseClass{

	Overview overView = new Overview();
	
	@Test(priority = 5)
	public void testOverviewPage() {
		overView.testingOverviewPage();
	}
}
