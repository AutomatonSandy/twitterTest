package project_utility;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import gherkin.lexer.Encoding;


public class ExtentManager {

	private static ExtentReports extentReports;
	private static String extentReportPath=System.getProperty("user.dir")+"//src//test//reports//";
	
	public static ExtentReports getExtentInstance() {
		if(extentReports == null) {
			extentReports = createExtentInstance();
		}
		
		return extentReports;
		
	}

	private static ExtentReports createExtentInstance() {
		Date date = new Date();
		String formattedDate = date.toString().replace(":", "_").replace(" ", "_");
		String fileName="extentReport_"+formattedDate+".html";
		extentReportPath = extentReportPath + fileName;
		ExtentSparkReporter  sparkReporter = new ExtentSparkReporter(new File(extentReportPath));
		sparkReporter.config().setDocumentTitle(fileName);
		sparkReporter.config().setTheme(Theme.STANDARD);
		sparkReporter.config().setEncoding(Encoding.DEFAULT_ENCODING);
		sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		return extent;
		
		
	}
}
