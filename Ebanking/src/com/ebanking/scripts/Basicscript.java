package com.ebanking.scripts;

import javax.swing.JList.DropLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicscript {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\chromedriver.exe");
		
		//Launch Browser
		
		String ExpVal="Ranford Bank";
		
		WebDriver driver=new ChromeDriver();
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://103.211.39.246/ranford2/");
		
		String ActVal=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		//Comparision
		
		if(ExpVal.equalsIgnoreCase(ActVal)) 
		{
			System.out.println("Application Launch Succ");
		}
		else
		{
			System.out.println("Application Failed To Launch");
		}
			
		
		//GetTitle
		
		String Tit=driver.getTitle();
		System.out.println(Tit);
		
		// Admin Login
		
		ExpVal="Welcome to Admin";
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		ActVal=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		//Comparision
		
		if (ExpVal.equalsIgnoreCase(ActVal)) 
		{
		System.out.println("Admin Login Succ");	
		}
		else
		{
			System.out.println("Admin Login Failed");
		}
		
		
		
		// Branch Creation
		
		ExpVal="Sucessfully";
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys("hdfcJuly22024");
		driver.findElement(By.id("txtAdd1")).sendKeys("SrNagar");
		driver.findElement(By.id("txtZip")).sendKeys("12345");
		
		//DropDown
		
		Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		Ctry.selectByVisibleText("INDIA");
		
		new Select(driver.findElement(By.id("lst_stateI"))).selectByVisibleText("Delhi");
		new Select(driver.findElement(By.id("lst_cityI"))).selectByVisibleText("Delhi");
		Thread.sleep(3000);
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(3000);
		
		//Alert
		
		ActVal=driver.switchTo().alert().getText();
		
		//Comparision
		
		if (ActVal.contains(ExpVal)) 
		{
			System.out.println("Branch Created");
		}
		else
		{
			System.out.println("Branch Already Exist");
		}
		
		driver.switchTo().alert().accept();
		//Home
		
	     // Role Creation
		
		// Employee Creation
		
		// Banker Login
		
	}

}
