package org.genericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//use to give description about class/methods----for that we have to write it in/**    */ above the class/Method name
/**
 * This class contains methods to fetch datas from the properties and excel files
 * 
 */
public class Read_Testdata implements FrameworkConstants
{
	/**
	 * This method is use to fetch datas from the properties files
	 * @param-- (String key)
	 * @return --value as per key passed from properties files
	 */
	public  String readDataFromProperties(String key)
	{
		File f = new File(PROPERTIES_PATH);//to convert .properties file into .java file
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
	 * This method is use to fetch datas from the excel files
	 * @parameter-- (String sheet, int row, int cell)
	 * @param sheetName [String]
	 * @param row [int]
	 * @param cell [int]
	 * @return --return data in string formate from excel files
	 */
	public  String readDataFromExcel(String sheetName,int row, int cell)
	{
		File f = new File(EXCEL_PATH);//to create file obj
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
     	String data= workbook.getSheet(sheetName).getRow(row).getCell(cell).toString();
		return data;
	}
/**
 * This method is used to get a row count based on given sheet name
 * @param sheetName [String]
 * @return rowCount [int]
 */
	public int getRowCount(String sheetName)
	{File f = new File(EXCEL_PATH);//to create file obj
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
	int rowCount = workbook.getSheet(sheetName).getPhysicalNumberOfRows();
	
	return rowCount;
	}
	/**
	 * This method is used to get the cell count based on given sheet name, and its rownum
	 * @param sheetName [String]
	 * @param rownum [int]
	 * @return cellCount [int]
	 */
	public int getCellCount(String sheetName, int rownum)
	{
		File f = new File(EXCEL_PATH);//to create file obj
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
		int cellCount = workbook.getSheet(sheetName).getRow(rownum).getPhysicalNumberOfCells();
		return cellCount;
	}
}
