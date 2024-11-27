package org.webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_UsingOptions_I_Methods 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
	//for Windows<<I>>
		//minimize(),maximize(),fullscreen()
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		System.out.println("Fullscreen size:"+driver.manage().window().getSize());
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//getSize()
		Dimension size = driver.manage().window().getSize();
		System.out.println("Size: "+size);   //store it in Dimension reference  & print it
		System.out.println("Size: "+driver.manage().window().getSize()); //print it directly with syso
		System.out.println("Width: "+ size.getWidth());
		System.out.println("Height: "+ size.getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		
		//setSize()
		Dimension targetSize = new Dimension(600, 300);
		driver.manage().window().setSize(targetSize);
		
		//getPosition()
		Point position = driver.manage().window().getPosition();
		System.out.println("Position: "+position);   //store it in Point reference  & print it
		System.out.println("Position: "+driver.manage().window().getPosition()); //print it directly with syso
		System.out.println("X coordinate: "+ position.getX());
		System.out.println("Y coordinate: "+ position.getY());
				
		//setPosition()
		Point targetPosition = new Point(99, 33);
		driver.manage().window().setPosition(targetPosition);
		
		
	    /*8)manage()--Options<<I>>--use to manage windows,timeouts,cookies., store it and use reference of Options<<I>> ex man.windows()
		                                                                    use directly with method chaining  ex driver.manage().windows().maximize()
		  * Methods of Options<<I>>
		    (i) windows()--Windows<<I>>--Return Windows<<I>> store it nd use or use directly by windows().maximize()
		                                 1)maximize()--void--use to maximize the window
		                                 2)minimize()--void--use to minimize the window
		                                 3)fullsceen()--void--use to see window in fullscreen
		                                 4)getSize()--Dimension(class of selenium)--use to get size of the window in the form of (width,hieght)
		                                                                            store it in Dimension(class of selenium)use reference & print it
		                                                                            Methods of Dimension class
		                                                                            i)getWidth()--Width--use to get width of window
		                                                                            ii)getHeight()--Height--use to get Height of window
		                                 5)setSize(Dimension targetSize)--void--use to set the size of window, ex setSize(new Dimension(width,height))
		                               
		                                 6)getPosition()--Point(class of selenium)--use to get position of the window in the form of (X,Y)
		                                                                            store it in Point(class of selenium)use reference & print it
		                                                                            Methods of Point class
		                                                                            i)getX()--int--use to get X coordinate of window
		                                                                            ii)getY()--nt--use to get Y coordinate of window
		                                 7)setPosition({Point targetPosition)--void--use to set the position of window,ex setPosition(new Point(X,Y))                                            
		     */
	}

}
