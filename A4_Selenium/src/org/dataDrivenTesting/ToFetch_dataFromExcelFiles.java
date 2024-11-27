package org.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetch_dataFromExcelFiles
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File f = new File(".\\Test-Resources\\DWS.xlsx");//to create file obj
     	FileInputStream fis = new FileInputStream(f);//to input file in stream
     	
     	Workbook workbook = WorkbookFactory.create(fis);//to create obj of Workbook by passing fis file
     	 Sheet sheet = workbook.getSheet("RegisterCredentials");//to get sheet of excel file
     	 Row row = sheet.getRow(1);//to get row of th sheet
     	 Cell cell = row.getCell(1);//to get cell of the row
     	 String data = cell.toString();//to convert cell type into String
     	 System.out.println(data);
     	 
     	String data2= workbook.getSheet("RegisterCredentials").getRow(1).getCell(2).toString();
     	System.out.println(data2);
		
	}

}
