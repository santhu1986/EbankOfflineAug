package com.ebanking.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNG 
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void Launchchrome()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void RanfordPage() throws InterruptedException
	{
		driver.get("http://103.211.39.246/ranford2/");
		Thread.sleep(3000);
	}

	@Test
	public void RPage() throws InterruptedException
	{
		driver.get("http://103.211.39.246/ranford1/");
		Thread.sleep(3000);
	}

	
	@AfterMethod
	public void AppClose() 
	{
		driver.close();
	}

}
