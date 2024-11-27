package org.genericUtilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProviderClass implements FrameworkConstants
{
	/*====2D Array=====
	 * when we want to create 2d array(array as a value inside one array) then go with below
	 * syntax: int[][] arr = new int[Outerarray size][innerarray size];
	 * type of 2d array--i) symetric 2d array---when all inner array size is same--arr[0][3], arr[2][3]
	 * 								ii) jagged 2d array---when inner array size are diffrent--- arr[0][1], arr[2][4]
	 * 
	 * ====Dataprovider==== : 
	An advance concept of testNg where we can execute a TestScript for multiple times with different data's, 
	> we are using set of Test datas need to be executed on a script in our excel sheet
	> we will use one annotation called as @DataProvider to take the data's row by row and execute the same testcase 
		based on the set of test data's available in that excel file.
	> data provider is responsible to drive the test case for multiple times
	
	 */
	@DataProvider(name = "REGISTER")
	public String[][] dataProviderMethod() {
		File f = new File(EXCEL_PATH);
		Workbook workbook=null;
		try {
		FileInputStream fis=new FileInputStream(f);
		workbook = WorkbookFactory.create(fis);
		}
		catch(Exception e) {
			
		}
		Sheet sheet = workbook.getSheet("RegisterCredentials");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] result= new String[rowCount-1][cellCount];//to remove first row with name use [rowcount-1] as a size
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String data=sheet.getRow(i).getCell(j).toString();
				result[i-1][j]=data;
			}
		}
		return result;
	}
	/* to test our DataProviderClass
 @Test(dataProvider = "REGISTER",dataProviderClass = DataProviderClass.class)
 public void test(String gender, String firstName, String lastName, String email, String password)
 {
	 System.out.println(gender);
	 System.out.println(firstName);
	 System.out.println(lastName);
	 System.out.println(email);
	 System.out.println(password);

 }
 */
}
