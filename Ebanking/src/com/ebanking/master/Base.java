package com.ebanking.master;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base {
  
	Library LB=new Library();
	
  @BeforeTest
  public void beforeTest() throws InterruptedException
  {
  //Admin Login
	  LB.AdmLgn("Admin","Mindq@Prj");
  }

  @AfterTest
  public void afterTest() throws InterruptedException 
  {
  //Log out
	  LB.Alogout();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
  //Launch
	LB.OpenApp("http://103.211.39.246/ranford2/");  
  }

  @AfterSuite
  public void afterSuite() throws InterruptedException 
  {
  //Close App
	  LB.Aclose();
  }

}
