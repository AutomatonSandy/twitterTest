package project_utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

public class TestListener extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			Screenshot.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		test.log(LogStatus.PASS, result.getName().toUpperCase()+" Failed with exception : "+result.getThrowable());
//		test.log(LogStatus.PASS, test.addScreenCapture(Screenshot.screenshotName));
		
		
		
		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target=\"_blank\" href="+Screenshot.screenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
//		System.out.println("<a target=\"_blank\" href="+Screenshot.screenshotPath+"><img src="+Screenshot.screenshotPath+" height=200 width=200></img></a>");
		Reporter.log("<a target=\"_blank\" href="+Screenshot.screenshotName+"><img src="+Screenshot.screenshotName+" height=200 width=200></img></a>");
//		rep.endTest(test);
//		rep.flush();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}
	
	

}
