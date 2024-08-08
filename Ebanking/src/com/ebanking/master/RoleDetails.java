package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoleDetails
{

	//EP
	
	@FindBy(id="btnRoles")
	WebElement Nrole;
	

	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement Home;
	
	//EM
	
	public void NewRole()
	{
		Nrole.click();
	}
	
	public void Rhome() 
	{
	    Home.click();
	}
	
}
