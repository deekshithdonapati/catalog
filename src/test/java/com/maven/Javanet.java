package com.maven;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Javanet extends Commoncon {
	

	@BeforeMethod
public void setUp(){
		openbrowser("Chrome");
		openurl("http://107.170.213.234/catalog/index.php");
}
	@AfterMethod
	public void setdown(){
		closebrowser();
	}
	@Test
	public void logoff(){
		clickLogyourselfLink();
		login("reddydonapati1991@gmail.com","reddydeekshith");
		clicksign();
		clicklogoff();
	
	}
}
	