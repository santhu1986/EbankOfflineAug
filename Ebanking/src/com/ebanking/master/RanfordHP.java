package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP
{

	//Element Properties
	
	@FindBy(id="txtuId")
	WebElement Uname;
	
	@FindBy(id="txtPword")
	WebElement Pwd;
	
	@FindBy(xpath="//*[@id=\"login\"]")
	WebElement Login;
	
	//Element Methods
	
	public void AdminLgn() throws InterruptedException
	{
		Uname.sendKeys("Admin");
		Pwd.sendKeys("Mindq@Prj");
		Thread.sleep(3000);
		Login.click();
	}
	
}
