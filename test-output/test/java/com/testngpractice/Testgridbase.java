package com.testngpractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class Testgridbase {
	
	
		public static RemoteWebDriver driver;

		    @BeforeTest
		    @Parameters({"platform","browsername","remoteurl"})
		    public void setUp(String platform,String browsername,String remoteurl) throws MalformedURLException {
		    	DesiredCapabilities cap =new DesiredCapabilities();
		    	if (browsername.equalsIgnoreCase("chrome")){
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deekshith Donapati\\Desktop\\chromedriver_win32\\chromedriver.exe");
					  new DesiredCapabilities();
					cap=DesiredCapabilities.chrome();
					}
				else if(browsername.equalsIgnoreCase("firefox")){
					System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deekshith Donapati\\Desktop\\geckodriver-v0.14.0-win32\\geckodriver.exe");
					  new DesiredCapabilities();
					cap=DesiredCapabilities.firefox();
					  
					  }
		    	
		  cap.setPlatform(Platform.WIN10);
		  driver=new RemoteWebDriver(new URL(remoteurl),cap);
		  driver.navigate().to("https://www.facebook.com/");
		    }
		 
		    @Test
		    public void googlesearch() throws InterruptedException{
		        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("deekshith"); 
	
	
		
	}

}



