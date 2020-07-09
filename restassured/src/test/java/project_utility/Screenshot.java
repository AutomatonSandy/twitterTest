package project_utility;

import java.io.IOException;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

public class Screenshot extends BaseClass{
	
	public static String screenshotPath;
	public static String screenshotName;
	
	public static void captureScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		System.out.println(" screen shot generated "+screenshotName);
		
		screenshotPath=System.getProperty("user.dir") + "\\target\\surefire-reports\\Suite\\" + screenshotName;
		FileUtils.copyFile(scrFile,
				new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\Suite\\" + screenshotName));
		

	}

}
