package org.dataDrivenTesting;

public class Info_DataDrivenTesting
{
	/*Data Driven Testing
		use store data in file to drive our testcase--Files use are--Properties file, Excel file, json file, database
		
	1)Properties file---stored data in the form of key=value pair, extension of file is-- .properties------Ex. browser : chrome
								  to store testcase comman data we go for this files like --username,password
								  we can fetch this data by using Properties(Class) of jdk pass key nd we will get the value of it

	2)Excel file---------stored data in the form of table, extension of file is .xls/.xlsx----Ex. table
								  to store testcase specific data we go for this like---testcase specific data
								  we can fatch data by using downloading (Apache poi jars),

==========For Properties File=============

###Create one folder inside project nd named it as Test-Resources
*How to create Properties File---folder(Test-Reources)--rightclick-new-file-name as DWS.properties, we can store key : value pairs directly in this properties file
			
			Step-1)To connect this .properties files with .java files---File f = new File(relative path of properties file);
																							   			 FileInputStream fis = new FileInputStream( f (OR) full path);
			Step-2)create obj of Properties(C) java.util package------ Properties prop = new Properties();
			Step-3)load this file into Properties(C)------------------------prop.load(fis);
			Step-4)getting value by passing key of Properties file-----String url = prop.getProperty("url");-----syso(url);
					
**we can fetch data directly by using another class-----Read_Testdata.readDataFromProperties("url");
   for that we have to declare static method in vlass, nd inside method we have to write above 4 steps, nd return prop.getProperty("key");
	   
==============For Excel Files=============
*First create Excel sheet in Excel--name as DWS.xlsx
		Step-1)To connect this .xlsx files with .java files----------File f = new File(relative path of excel file);   //establish stream btw program nd file
																						         	FileInputStream fis = new FileInputStream( f (OR) full path);
		Step-2)create obj of Workbook<I>
		 			by using WorkbookFactory(C) method 					 //this will throw IO & Encripted Exception
		 			name as create()which accepte fis as xssf-----------Workbook workbook = WorkbookFactory.create(fis); //load excel file into workbook type
		Step-3)get the sheet from added file use Sheet<I>-----------Sheet sheet = workbook.getSheet("sheetName");
		Step-4)get the row from added sheet us Row<I>-------------Row row = sheet.getRow(rowindex);
		Step-5)get the cell from added row use Cell<I>--------------Cell cell = row.getCell(cellindex);
		Step-6)convert this cell type data into String ----------------String data = cell.toString();
		            we can also use---------------------------------------------------------------cell.getStringCellValue();
		            																			                       	     cell.getNumericCellValue();
		            																				                         cell.getBooleanCellValue():
		
		**we can fetch data by using all method together also--------String data= workbook.getSheet("sheetname").getRow(index).getCell(index).toString();
		*here, import all the <I> of apache poi
		
Note:  (i)sheet.getPhisicalNumberOfRows();	//use to get the number in how many row data filled in this sheet	
           (iI)sheet.getPhisicalNumberOfCells();	//use to get the number in how many cell data filled in this sheet	

	   
	   

*/

}
