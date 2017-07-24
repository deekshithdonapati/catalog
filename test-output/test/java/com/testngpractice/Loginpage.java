package com.testngpractice;

 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.jass.common.CommonMethods;
import com.jass.pageobject.LogOffPage;
import com.jass.pageobject.SignInPage;
import com.jass.pageobject.WelcomePage;


public class Loginpage {  
	public CommonMethods CM;
	WelcomePage WP;
	SignInPage SI;
	LogOffPage LP;
	@Parameters({"browser"})
	@BeforeMethod
	public void setup(){
		CM=new CommonMethods();
		CM.openBrowser("Chrome");
		CM.openBrowser("firefox");
		CM.openUrl("http://107.170.213.234/catalog/");
	}
	
	@AfterMethod
	public void setdown(){
		CM.closeBrowser();
	}
	
@Test
public void testcase(){
	 WP=new WelcomePage();
	WP.clickLogyourselfLink();
	 SI=new SignInPage();
	SI.Login("deekshithdonapati@gmail.com","reddydeekshith");
	 LP=new LogOffPage();
	LP.clickLogoff();
}

}

