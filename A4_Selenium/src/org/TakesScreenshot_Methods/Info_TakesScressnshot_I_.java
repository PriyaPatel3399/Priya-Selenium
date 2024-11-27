package org.TakesScreenshot_Methods;

public class Info_TakesScressnshot_I_ 
{
	/*==TakesScreenshot Method====
	   1)TakesScreenshot(OutputType typeHint)-
	      * first we have to do non-primitive typecasting from---WebDriver to TakesScreenshot---by this ref we can access  the method pf TakesScreenshot<<I>>
	 
	  	==OutputType (Enum)===
	 	1.OutputType.FILE---File(C)---this File class present in java.io package--use to store taken SS in File class temparary,till program execution ends
	 													 to store it permanantly set path of ss,(by using absolute or relative path)
	 													 copy taken ss in FileHandler.copy(screenhot_foldername,realss_ssName);               
	 	2.OutputType.BASE64---String---
	 	3.OutputType.BYTES---byte[]---
	 	
 Ex. 1)for taking ss of webpage
  		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);//capture ss tampapry,which remove when program execution ends
		File realss = new File("C:\\Users\\admin\\Desktop\\screenshot.png");//to take ss, use this way, take a desktop absolutepath and add \\screenshot.png
		FileHandler.copy(screenshot, realss);//copy taken ss to see it on the desktop
	  
	    2) for taking ss of WebElement
	  	WebElement product = driver.findElement(By.xpath("//div[contains(text(),'Happy Birthday Tin Box')]/../../../.."));//locate product by xpath
		File screenshot = product.getScreenshotAs(OutputType.FILE);//use element ref. to capture ss of webElement
		File realscreenshot = new File(".\\errorshots\\"+timeStamp+"screenshot.png");//concat timeStamp in path, for store file with uniqe date nd time
		FileHandler.copy(screenshot, realscreenshot);//copy
	
	 */

}
