package swaglabs_tests;

import org.testng.annotations.Test;

import swaglabs_Utility.BaseClass;
import swaglabs_pages.Swaglabs_Loginpage;

public class LoginTest extends BaseClass{
	
	@Test(priority =1)
	public void TestMethod() {
		String url=System.getProperty("url");
		String userName=System.getProperty("id");
		String passWord= System.getProperty("pass");
		Swaglabs_Loginpage loginpage = new Swaglabs_Loginpage();
		loginpage.launch_and_Maximize(url);
		loginpage.fillUserName_and_Login(userName, passWord);
	}
}
