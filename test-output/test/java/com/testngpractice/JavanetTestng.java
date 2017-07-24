package com.testngpractice;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class JavanetTestng {
private WebDriver driver;

	@Test
public void test() throws MalformedURLException, InterruptedException{
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		cap.setVersion("53.0.2");
		 driver = new RemoteWebDriver(new URL("http://192.168.33.1:4355/wd/hub"), cap);
		Thread.sleep(5000);
  driver.get("http://107.170.213.234/catalog/");
  driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[2]/u")).click();
  driver.findElement(By.xpath("//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
  driver.findElement(By.name("firstname")).sendKeys("deekshith");
  driver.findElement(By.name("lastname")).sendKeys("donapati");
  driver.findElement(By.xpath("//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
}
}
	