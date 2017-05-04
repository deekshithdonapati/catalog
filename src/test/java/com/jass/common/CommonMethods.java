package com.jass.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


	public class CommonMethods {
		public  static WebDriver driver;
		public void openBrowser(String sbrowser){
			
					if (sbrowser.equalsIgnoreCase("chrome")){
						System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deekshith Donapati\\Desktop\\chromedriver_win32\\chromedriver.exe");
						  driver=new ChromeDriver();
						  System.out.println("open browser");
						  
					}
				else
				{
						System.out.println("Pleas open");
						Assert.fail();
					}
				}
					public void closeBrowser(){
						driver.quit();
						System.out.println("close Browser");
						}
				
				public void openUrl(String sUrl){
					
					driver.get(sUrl);
					System.out.println("openurl");
					driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
											
				}
				
				
				
				
				public void sendvalue(String sxpath, String svalue){
					try{
						driver.findElement(By.xpath(sxpath)).clear();
				    System.out.println("clear the field");
				  
				    driver.findElement(By.xpath(sxpath)).sendKeys(svalue);
				    System.out.println("Enter the value="+svalue);
				  
				   // try {
						//Thread.sleep(2000);
					} catch (Exception e) {
						System.out.println(svalue+ " not entered");
						Assert.fail();
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}
				
				}
			
					
				
		
		 public void verifyText(String expected){
			 try{
				 driver.findElement(By.xpath(".//*[contains(text(),'"+ expected.trim() +"')]"));
				 System.out.println("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" verified");
				// return true;
			 }
			 catch(NoSuchElementException e){
				 System.out.println("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" not found");
				 Assert.fail("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" not found");
			 }
			 
		 }
		 public void click(String sXAPTH){
				try{
  					driver.findElement(By.xpath(sXAPTH)).click();
				System.out.println( sXAPTH+ "clicked");
				
				}
				catch(Exception e){
					System.out.println( sXAPTH+ " not clicked");
					e.printStackTrace();
					Assert.fail();
				}
		 }
		 public void Click(WebElement slocator){
				try{
					slocator.click();
				System.out.println( slocator+ "clicked");
				
				}
				catch(Exception e){
					System.out.println( slocator+ " not clicked");
					e.printStackTrace();
					Assert.fail();
				}
		 }
		 
	}		
			


	


