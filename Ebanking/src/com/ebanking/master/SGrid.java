package com.ebanking.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SGrid
{

	DesiredCapabilities Cap;
	@Test
	public void Gd() throws MalformedURLException, InterruptedException
	{
		Cap=new DesiredCapabilities();
		Cap.setBrowserName("chrome");
		Cap.setPlatform(Platform.ANY);
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.41.1:4444/wd/hub"),Cap);
		
		driver.manage().window().maximize();
		driver.get("http://103.211.39.246/ranford2/");
		
		//Login
		
	    RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
		RHP.AdminLgn();
		

		AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
		AHP.Rol();
		
		Thread.sleep(3000);
		// New Role
		
		RoleDetails RD=PageFactory.initElements(driver,RoleDetails.class);
		RD.NewRole();
		
		Thread.sleep(3000);		
		
		//Rolecreation
		
		RoleCreation Rcre=PageFactory.initElements(driver,RoleCreation.class);
		Rcre.Rcreation("Cashierxyz","E");
		Thread.sleep(3000);
		//Alert
		
		driver.switchTo().alert().accept();
	

		
	}
	
}
