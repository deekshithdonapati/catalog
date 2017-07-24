package com.catalog.tests;
import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import com.catalog.pages.HomePage;
import com.catalog.pages.SignInPage;
import com.learnautomation.selenium.CommonMethods;

	
	public class SignInTests {
		private WebDriver driver;
		public CommonMethods CM;
		public String URLName="http://107.170.213.234/catalog/";
		private static Logger log=LogManager.getLogger(SignInTests.class);
		
		@BeforeMethod(alwaysRun=true)
		public void SetUp(){
			CM=new CommonMethods(driver);
			driver = CM.openBrowser("Chrome");
			CM.navigateURL(URLName);
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
		@Test(groups = {"Regression"})
		public void Login_01() throws Exception{
			File src=new File("C:\\Users\\Deekshith Donapati\\Desktop\\Book2.xlsx");
			FileInputStream fls =new FileInputStream(src);
			XSSFWorkbook wb =new XSSFWorkbook(fls);
			XSSFSheet sheet1=wb.getSheetAt(0);
			String drv=sheet1.getRow(0).getCell(0).getStringCellValue();
			String def=sheet1.getRow(1).getCell(0).getStringCellValue();
			HomePage HomePage=new HomePage(driver);
			log.info("home page is displayed");
			HomePage.clickLogYourSelfIn();
			SignInPage SignInPage=new SignInPage(driver);
			SignInPage.Login(drv, def);
			log.info("sucessfully entered the values");
			CM.VerifyTitle("iBusiness");
			SignInPage.clickSingOff();
			log.info("successfully logged out");
			TakesScreenshot ts=(TakesScreenshot)driver;
		 	File src1=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File ("./screenshot/oscommerce.png"));
			
	}
		
		
		
		@AfterMethod(alwaysRun=true)
		public void tearDown(){
			
			CM.closeBrowser();
		}

}
