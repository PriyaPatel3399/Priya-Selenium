package org.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetch_dataFromPropertiesFile 
{
	public static void main(String[] args) throws IOException  
	{
		File f = new File(".\\Test-Resources\\DWS.properties");//to convert .properties file into .java file
		FileInputStream fis = new FileInputStream(f);//to fetch all the input of file
		
		Properties prop = new Properties();
		
		prop.load(fis);//to load this file into propertis to 
		
		//to get value by passing key of it
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(email);
		System.out.println(password);
		
		//fetch data directly from  Read_Testdata class by using its readDataFromProperties("key") method
		System.out.println( Read_Testdata.readDataFromProperties("url") );
		}

}
