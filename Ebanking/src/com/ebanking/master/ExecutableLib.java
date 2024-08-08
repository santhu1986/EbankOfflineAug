package com.ebanking.master;

import java.io.IOException;

public class ExecutableLib {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		 // Instance Class 
		
		Library LB=new Library();
		
		String Rval=LB.OpenApp("http://103.211.39.246/ranford2/");
		System.out.println(Rval);
		LB.AdmLgn("Admin","Mindq@Prj");
		Rval=LB.Bcreation("IciciSrnagar24","Ammerpet","45689","INDIA","GOA","GOA");
		System.out.println(Rval);
		
		
	}

}
