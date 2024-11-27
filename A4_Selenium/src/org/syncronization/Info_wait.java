package org.syncronization;

public class Info_wait 
{
	/*1)===== Implicit wait =====
	   Implicit wait is a Selenium feature that instructs to wait for a specified amount of time before  throwing an exception 
	  	when it can't find an element on a page.  It's applied globally to all findElement() and findElements|) to identify elements on the page  
		#Working  
		When control comes for findElement() or findElements(), it tries to locate the web element or  web elements 
		 If web element or web elements are present in webpage, it will return Webelement or  List<WebElement> as return type  
		 But if the web element or web elements are not present on web page, then do we have implicit  wait time will be checked  
		 If implicit wait is used, then thread will undergo polling period of 500ms and again it checks once  again in web page  
		 Until implicit wait time is available process repeats, if element is present, it will be located and  execution continues  
		 When implicit wait time becomes zero, we will get NoSuchElementException or Empty List
	 
	 	#Polling period or polling frequency
		Thread will sleep or wait for a certain time before it checks element or condition once again Standard polling period is 500ms
 		Note
		Implicit wait is only applicable for findElement() and findElements()
		Syntax
		driver.manage().timeouts().implicitlyWait(Duration timeout);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15);
		
		2)======Explicit wait =====
		Explicit wait is a Selenium technique that allows you to wait for specific conditions to be met  before proceeding with the next instruction in your test scripts
	  	We have to define the condition, such as the presence or absence of an element,  using ExpectedConditions class. 
	  	An exception is thrown if the condition is not met within the  specified time.  
		#Working  
		When control comes for line of code where we have condition, it checks condition is satisfied or  not  
		If condition is satisfied control goes to next instruction  But if the condition is not satisfied, then do we have explicit wait time will be checked  
		If explicit wait time is available, then thread will undergo polling period of 500ms and again it  checks once again in web page for the condition  
		Until explicit wait time is available process repeats, if condition satisfied, control goes to next  instruction and execution continues.  
		When explicit wait time becomes zero, we will get TimeOutException  

		#Syntax  
		Create Object of WebDriverWait  a Constructor: WebDriverWait(WebDriver driver, Duration duration)  	
																					   WebDriverWait explicitWait = new WebDriver(driver, Duration.ofSeconds(15)):  
		Use the non-static method until() of WebDriverWait to waitt and inside that we have to provide  conditions, 
		 to provide conditions Selenium provides a class called as ExpectedConditions where  we have 40+ static methods which acts as conditions  
     				Ex.explicitWait.until(Expec5ttedConditions.anyMethodWhichIsFeasible  
						 explicitWait.until(ExpectedConditions.element ToBeClickable(checkButton));
						 
	  3)==== Fluent Wait====
	 
		Fluent Wait is a Selenium technique exactly similar to Explicit wait
		 which allows you to wait for specific conditions to be met before proceeding with the next instruction in your test scripts 
		 Advantage that we have over explicit wait is we can change the standard polling period/ polling frequency 
		 Even we can ignore exception as well Since all the Synchronization issues we will handle using implicit and explicit wait itself 
		 Fluent Wait is not used in Industry most of the time
 
 		#Below code provides basic using of Fluent Wait
			//Declare and initialise a fluent wait 
		 		FluentWait wait = new FluentWait (driver); 
		 	//Specify the timeout of the wait 
		  		wait.withTimeout(Duration.ofSeconds(15));
		   //Sepcify polling time 
		   	  wait.pollingEvery(Duration.ofMillis(250));
		   //Specify what exceptions to ignore 
	     	  wait.ignoring(NoSuchElementException.class) 
	      //This is how we specify the condition to 
	   	      wait on wait.until(ExpectedConditions.alertIsPresent());
	   	      
	 */

}
