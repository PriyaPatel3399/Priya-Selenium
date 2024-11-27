package org.basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingDiff_BrowserBasedOnUserInput
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Browser Name: ");
		Scanner  scanner = new Scanner(System.in);
		String browsername = scanner.next();
		
		WebDriver driver;
		
		//here using if-else ladder at the place of switch because in switch we can't use equalsIbnoreCase() method
		if(browsername.equalsIgnoreCase("Chrome") ){
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge") ){
			driver = new EdgeDriver();
		}
		else{
			System.err.println("Invalid Browser name");  //err:--use to see the print stmt in red colour
		}
	}

}
