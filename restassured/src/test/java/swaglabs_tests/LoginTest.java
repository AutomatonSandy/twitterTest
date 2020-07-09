package swaglabs_tests;

import org.testng.annotations.Test;


import swaglabs_pages.Swaglabs_Loginpage;

public class LoginTest extends project_utility.BaseClass{
	
	Swaglabs_Loginpage loginpage = new Swaglabs_Loginpage();
	
	@Test(priority =1)
	public void TestMethod() {
		String url=System.getProperty("url");
		String userName=System.getProperty("id");
		String passWord= System.getProperty("pass");
		System.out.println("before loginpage");
		loginpage.launch_and_Maximize(url);
		loginpage.fillUserName_and_Login(userName, passWord);
	}
}	
//	clean test -Dsurefire.suiteXmlFiles=testngSwagLab.xml -Dbrowser=chrome -Durl=https://www.saucedemo.com/index.html -Did=standard_user -Dpass=secret_sauce
//https://github.com/AutomatonSandy/twitterTest.git}
