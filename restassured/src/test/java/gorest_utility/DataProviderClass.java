package gorest_utility;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import gorest_utility.ExcelReaderUtility;

public class DataProviderClass {
	
	private static ExcelReaderUtility excelUtil;
	
	@DataProvider(name="happypath_data")
	public static Object[][] dataProviderMethod(Method m){
		if(m.getName().equalsIgnoreCase("methodSix")) {
			excelUtil = new ExcelReaderUtility("TestData.xlsx", "Sheet2", "Method Six");
			return excelUtil.readNumberOfLinesInTestCase_andReturnDataArray();
		}
		return new Object[][] {{1},{2}};
	}
	

}