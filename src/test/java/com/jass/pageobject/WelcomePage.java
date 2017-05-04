package com.jass.pageobject;
import com.jass.common.CommonMethods;

public class WelcomePage {  
 public CommonMethods CM;
	 
 public void clickLogyourselfLink(){
	CM = new CommonMethods();
     CM.click("//*[@id='bodyContent']/div/div[1]/a[1]/u");
		 System.out.println("Welcome page");
	}
	
	}
