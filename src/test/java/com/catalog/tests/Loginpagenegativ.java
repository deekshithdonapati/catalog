package com.catalog.tests;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.learnautomation.selenium.CommonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpagenegativ {
 WebDriver driver;
 CommonMethods CM;


@FindBy(how=How.LINK_TEXT, using="log yourself in")
private WebElement logyourselflink;

@FindBy(how=How.XPATH, using="//*['@id=bodyContent']/div[2]/div/form/table/tbody/tr[1]/td[2]/input")
private WebElement username;
@FindBy(how=How.NAME, using="password")
private WebElement password;

@Test
public void clicklogyourselflink(){
	CM=new CommonMethods(driver);
	driver=CM.openBrowser("Chrome");
	CM.navigateURL("http://107.170.213.234/catalog/"); 
	PageFactory.initElements(this.driver, this);
	logyourselflink.click();
	username.sendKeys("deekshithdonapati@gmail.com");
	password.sendKeys("reddydeeksshith");
	
}

}  
  
 
	