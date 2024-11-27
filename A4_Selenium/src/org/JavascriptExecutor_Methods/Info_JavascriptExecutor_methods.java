package org.JavascriptExecutor_Methods;

public class Info_JavascriptExecutor_methods
{
/* first we have to do non-primitive typecasting from---WebDriver to JavascriptExecutor---by this ref we can access  the method of JavascriptExecutor<<I>>
			Ex. JavascriptExecutor js = (JavascriptExecutor)driver;
				 jse.methodname();

	##We use JavascriptExecutor to execute javascript codes from selenium
	
	====JavascriptExecutor Methods====
	1. executeScript(Object...data)---use to pass javascript in method, to run javascript
	2. executeAsyncScript(Object...data)---use to pass javascript in async form in method, to run javascript
	
	## we have to write Javascript code in Console of html code inspect, nd paste this script line in method arg as a string
	  	*(i)to scoll webpage use ---1)window.scrollBy(x,y) nd enter---page will scroll by given amount from the line where is present now
													2) window.scrollTo(x,y) nd enter---page will scroll by given amount from starting point
													3) arguments[0].scrollIntoView(boolean) nd enter---give element index in argument, nd give true/false to scroll till that element
																			#locate element bu using selenium-----("arguments[0].scrollIntoView(boolean)",locatedElementReference)
																			#locate element by using javascript-----Ex.let arguments = document.getElementsByTagName('a')
																																	 	 		argument[85]
																																	 	 		(argument[85]..scrollIntoView(true))
		*(ii)to pass data in disabled textBox--4)"arguments[0].value='value'"---to pass data in any textbox, use method pass data in value, nd give element ref.
																																Ex.("arguments[0].value='data'",elementRef)
									
	 	*(iii)to click on disable/enable element--5)arguments[0].click()---to click on any button by locating element with selenium or javascript
	 																												Ex. ("arguments[0].click()", elementRef)
	 																												
	 	*(iv) to fetch length of the webpage----6)document.body.scrollHeight---use to get height of webpage
	
	
*/
}
