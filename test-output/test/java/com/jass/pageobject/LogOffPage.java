package com.jass.pageobject;


import com.jass.common.CommonMethods;

public class LogOffPage {

    

	public CommonMethods CM;
	
	public void  clickLogoff()
	{
		CM=new CommonMethods();
		CM.click("//*[@id='tdb4']/span");
		System.out.println("Click chrome off");
		System.out.println("Click firefox off");
		}
}
