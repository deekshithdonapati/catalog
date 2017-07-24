package com.catalog.pages;
	import org.openqa.selenium.WebDriver;

import com.learnautomation.selenium.CommonMethods;


	public class HomePage {
		private WebDriver driver;
		public CommonMethods CM;
		public String LogYourSelfLink="log yourself in";
		
		public HomePage(WebDriver driver){
			this.driver = driver;
			
			//this.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		public void clickLogYourSelfIn(){
			CM=new CommonMethods(driver);
			CM.clickElementByLinkText(LogYourSelfLink);
			//driver.findElement(By.linkText(LogYourSelfLink)).click();
			System.out.println("link clicked");
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}


}
