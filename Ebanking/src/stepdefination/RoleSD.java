package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleSD 
{
     WebDriver driver;
     

@Given("^Tester Should on Ranford HP$")
public void tester_Should_on_Ranford_HP() throws Throwable
{
	driver=new FirefoxDriver();
    driver.get("http://192.168.1.4/ranford2");
    driver.manage().window().maximize();
	
}

@When("^Tester Enters Login Details$")
public void tester_Enters_Login_Details() throws Throwable 
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	
}

@Then("^Tester click on Role button$")
public void tester_click_on_Role_button() throws Throwable 
{
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	Thread.sleep(3000);

}

@When("^Tester click on New Role and enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void tester_click_on_New_Role_and_enters_and(String Rn, String Rt) throws Throwable 
{
	driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
	driver.findElement(By.id("txtRname")).sendKeys(Rn);
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys(Rt);
	
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
	
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
}

@Then("^Tester close the Application$")
public void tester_close_the_Application() throws Throwable 
{
     driver.close();
}


}
