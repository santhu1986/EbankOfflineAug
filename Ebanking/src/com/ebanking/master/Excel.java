package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// Instance Class
		
		Library LB=new Library();
		
		LB.OpenApp("http://192.168.1.4/ranford2");
		LB.AdmLgn("Admin","Admin");
		
		//To get Test Data File
		
		FileInputStream FIS=new FileInputStream("D:\\SeleniumPrjEvngJuly\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
		//WorkBook
		
		XSSFWorkbook WB=new XSSFWorkbook(FIS);
		
		//Sheet
		
		XSSFSheet WS=WB.getSheet("Rdata");
		
		//Row Count
		
		int Rcount=WS.getLastRowNum();
		System.out.println(Rcount);
		
		// Multiple Iterations ---------- Loop
		
		for (int i=1;i<=Rcount;i++) 
		{
		
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
			//Cell
			
			XSSFCell WC =WR.getCell(0);      //RoleName
			XSSFCell WC1 =WR.getCell(1);     //RoleType
			
			XSSFCell WC2=WR.createCell(2);   //Results
			
			//Cell Values
			
			String Rname=WC.getStringCellValue();
			String Rty=WC1.getStringCellValue();
			
			//Role Creation
			
			String Res=LB.Role(Rname,Rty);
			System.out.println(Res);
			
			WC2.setCellValue(Res);
		}
		
		FileOutputStream FOS =new FileOutputStream("D:\\SeleniumPrjEvngJuly\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
		WB.write(FOS);
		WB.close();
		
 }

}
