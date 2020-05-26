package swaglabs_tests;

import org.testng.annotations.Test;

import swaglabs_Utility.BaseClass;
import swaglabs_pages.Finish;

public class FinishTest extends BaseClass{

	Finish finish = new Finish();
	@Test(priority = 6)
	public void FinishPageTest() {
		finish.finishTest();
	}
	
}
