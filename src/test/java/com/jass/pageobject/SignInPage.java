  package com.jass.pageobject;




import com.jass.common.CommonMethods;

public class SignInPage {
	public CommonMethods CM;

  // @FindBy(how = How.NAME, using = "email_address")
   // private WebElement EMAILADDRESS;
    
   // @FindBy(how = How.NAME, using = "password")
   // private WebElement PASSWORD;
    
  // @FindBy(how = How.XPATH, using = "//*[@id='tdb5']/span[1]")
   // private WebElement SIGNIN;

	public void Login(String Username, String PWD){
		CM=new CommonMethods();
		CM.sendvalue("//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[1]/td[2]/input", Username);
		CM.sendvalue("//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[2]/td[2]/input", PWD);
		 CM.click("//*[@id='tdb5']/span[2]");
				
	}

	public void clicksign(){
		CM.click("//*[@id='tdb5']/span[2]");
		
	}


}
