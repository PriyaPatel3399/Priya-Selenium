package org.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//use to give description about class/methods----for that we have to write it in/**    */ above the class/Method name
/**
 * this class contains methods to fetch datas from the properties files
 */
public class Read_Testdata
{
	/**
	 * this method is use to fetch datas from the properties files
	 * @parameter-- (String key)
	 * @return --value as per key passed from properties files
	 */
	public static String readDataFromProperties(String key)
	{
		File f = new File(".\\Test-Resources\\DWS.properties");//to convert .properties file into .java file
		FileInputStream fis= null;
		//to handle FileNotFoundException
		try{
			fis = new FileInputStream(f);
		}
		catch (FileNotFoundException e){
		}
		//to handle IOException
		Properties prop = new Properties();
		try{
			prop.load(fis);
		}
		catch (IOException e) {
		}
	
		return prop.getProperty(key);
	}
	/**
	 * this method is use to fetch datas from the excel files
	 * @parameter-- (String sheet, int row, int cell)
	 * @return --return data in string formate from excel files
	 */
	public static String readDataFromExcel(String sheet,int row, int cell)
	{
		File f = new File(".\\Test-Resources\\DWS.xlsx");//to create file obj
     	FileInputStream fis=null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			
		}
       	Workbook workbook=null;
		try {
			workbook = WorkbookFactory.create(fis);
		} 
		catch (IOException e) {
		}
     	String data= workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
		return data;
	}
}
