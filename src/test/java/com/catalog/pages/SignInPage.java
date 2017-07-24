package com.catalog.pages;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import com.learnautomation.selenium.CommonMethods;


	public class SignInPage {
		private WebDriver driver;
		public CommonMethods CM;
		public String EmailAddress="email_address";
		public String Password="password";
		public String SignInButton="//*[@id='tdb5']/span[2]";
		public String SignOff="//*[@id='tdb4']/span";
		public SignInPage(WebDriver driver){
			this.driver = driver;
			CM=new CommonMethods(this.driver);
			this.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		public void Login(String userName,String password ){
			//CM=new CommonMethods(driver);
			CM.setValueByName(EmailAddress,userName);
			//driver.findElement(By.name(userName)).sendKeys(userName);
			CM.setValueByName(Password,password);
			CM.clickElementByXPATH(SignInButton);
		}
		
		public void clickSingOff(){
			CM.clickElementByXPATH(SignOff);
		}
	}


