package org.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_Location_tofatchSizeLocation
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//to check alignment of textbox we have to locate and get size of textbox first, store it nd compare it, we have to locate base on highlighted att from htmlcode
		WebElement emailTextBox = driver.findElement(By.id("email"));
		WebElement passwordTextBox = driver.findElement(By.id("passContainer"));
	    Dimension emailTextboxSize = emailTextBox.getSize();//getSize() in the form of  (Width,Height)--getHeight(), getWidth()
	    System.out.println("EmailTextboxSize: "+emailTextboxSize);
	    Dimension passwordtboxSize = passwordTextBox.getSize();
	    Point emailTextboxLocation = emailTextBox.getLocation();//getLocation() in the form of (x,y)---getX(), getY() 
	    Point passwordtboxLocation = passwordTextBox.getLocation();
	    Point emailTextBoxPoint = emailTextBox.getRect().getPoint();//getRect() in this we have getX(), getY(), getHeight(), getDimension()getDimension() getWidth(), getPoint()
	    System.out.println("Point(Location) of emailtextbox: "+emailTextBoxPoint );// get point of textbox(x,y)
	   
	    //check left alignment-----for left take diff of x axses
	    int leftAlignmentDiff = emailTextboxLocation.getX() - passwordtboxLocation.getX();  
	    System.out.println("leftAlignmentDiff: "+leftAlignmentDiff);
	    if(leftAlignmentDiff > -5 && leftAlignmentDiff < 5)
	    {
	    	System.out.println("left Alignment is perfect");
	    }
	    else
	    {
	    	System.out.println("left Alignment is not correct");
	    }
	    //check right alignment-----for right take diff of location_x axses + boxsize_width
	    int rightAlignmentDiff = (emailTextboxLocation.getX()+ emailTextboxSize.getWidth()) - ( passwordtboxLocation.getX() +passwordtboxSize.getWidth()) ;
	    System.out.println("rightAlignmentDiff: "+rightAlignmentDiff);
	    if(rightAlignmentDiff > -5 && rightAlignmentDiff < 5)
	    {
	    	System.out.println("right Alignment is correct");
	    }
	    else
	    {
	    	System.out.println("right Alignment is not perfect");
	    }
	    
	  //check overlapping alignment-----for this take diff of Y axses + boxize_hieght
	    int OverlappingDiff = (passwordtboxLocation.getY()) - (emailTextboxLocation.getY()+ emailTextboxSize.getHeight());  
	    System.out.println("OverlappingDiff: "+OverlappingDiff);
	    if(OverlappingDiff > 0)
	    {
	    	System.out.println("Not overlapped");
	    }
	    else
	    {
	    	System.out.println("Overlapped");
	    }
	}

}
