package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RoleCreation 
{

	//EP
	
	@FindBy(id="txtRname")
	WebElement Rname;
	
	@FindBy(id="lstRtypeN")
	WebElement Rtype;
	
	@FindBy(id="btninsert")
	WebElement Rsubmit;
	
	
	//EM
	
	public void Rcreation(String Rn,String Rt) throws InterruptedException 
	{
		
	Rname.sendKeys(Rn);
	Select RT=new Select(Rtype);
	RT.selectByVisibleText(Rt);
	Thread.sleep(3000);
	Rsubmit.click();
	
	}
}
