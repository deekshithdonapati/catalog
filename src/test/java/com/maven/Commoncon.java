package com.maven;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Commoncon {
	public WebDriver driver;
	public void openbrowser(String sBrowser){
	if(sBrowser.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deekshith Donapati\\Desktop\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  System.out.println("open browser");
	}
	else{
		System.out.println("please open browser ");
		Assert.fail();
	}
	}
	public void openurl(String surl){
		driver.get(surl);
		System.out.println("opening url");
		
	}
		public void closebrowser(){
			driver.quit();
			System.out.println("closing browser");
		
	}
		public void clickLogyourselfLink(){
			driver.findElement(By.xpath("//*['@id=bodyContent']/div/div[1]/a[1]/u")).click();
			  System.out.println("click logyourselflink");
		}
		public void login(String username,String PASSWORD){
			driver.findElement(By.xpath("//*['@id=bodyContent']/div[2]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(PASSWORD);
			try{
				Thread.sleep(3000);
			}catch(InterruptedException e ){
				e.printStackTrace();	
			}
			}
	
public void clicksign(){

	driver.findElement(By.xpath("//*[@id='tdb5']/span[2]")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	 
	public void clicklogoff(){
		driver.findElement(By.xpath("//*[@id='tdb4']/span")).click();
		
		System.out.println("logoff");
	
	}
	
	
	public void VerifyText(String expected){
		try{
			driver.findElement(By.xpath("//*[@id='bodyContent']/h1"+ expected.trim() +"')]"));
			System.out.println("on page "+ driver.getTitle() +".Expected Text \""+ expected +"\" verified");
		} 
		catch(NoSuchElementException e){
			System.out.println("On page "+driver.getTitle() + ".Expected Text\""+ expected +"\" not found");
			Assert.fail("On page "+driver.getTitle() + ".Expected Text\""+ expected +"\" not found");
		} 
		}
	public void click(String string) {
		// TODO Auto-generated method stub
		
	}
	public void sendvalue(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	}

