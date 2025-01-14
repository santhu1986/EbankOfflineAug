package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSD 
{

  WebDriver driver;
	
@Given("^User should on RHP$")
public void user_should_on_RHP() throws Throwable 
{
     driver=new FirefoxDriver();
     driver.get("http://192.168.1.4/ranford2");
     driver.manage().window().maximize();
}

@When("^User enters \"(.*)\" and \"(.*)\"$")
public void user_enters_uname_and_password(String Un,String Pwd) throws Throwable
{
	driver.findElement(By.id("txtuId")).sendKeys(Un);
	driver.findElement(By.id("txtPword")).sendKeys(Pwd);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	
}

@Then("^User validates Admin Login functionality$")
public void user_validates_Admin_Login_functionality() throws Throwable 
{
	String ExpVal="Welcome to Admin";
	
	String ActVal=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	
	//Comparision
	
	if (ExpVal.equalsIgnoreCase(ActVal)) 
	{
	System.out.println("Admin Login Succ");	
	}
	else
	{
		System.out.println("Admin Login Failed");
	}

}


}
