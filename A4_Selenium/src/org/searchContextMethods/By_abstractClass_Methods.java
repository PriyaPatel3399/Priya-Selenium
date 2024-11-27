package org.searchContextMethods;

public class By_abstractClass_Methods 
{
/*	##Methods of SearchContext<<I>>##
       
    i)findElement(By locator)--WebElemnt<<I>--use to locate an element,it accept By type of obj,
												   it return WebElement<I>, store it to use multiple time 
   ii)findElements(By locator)--List<-WebElemnt>--use to locate multiple elements,it accept By type of obj,
												   it return List<WebElement> type, store it to use multiple time											   
  
 ##By abs.class##
    By is an abstract class, 
  	which has 8 static methods, which returns By type of object, that obj we can pass to locate an element in findElement()/findElements() methods
  	
	 1) id(String id) //ctrl + f--to search id with #id (ex. #email),& give it in By.id(email)
	 2) name(String name)
	 3) linkText(String linktext)
	 4) partialLinkText(String partiallinktext)
	 5) className(String classname)
	 6) tagName(Stirng tagname)
	 7) cssSelector(String cssexpression)
	 8) xpath(String xpathexprssion)
	 
	 **Standards to locate an element**
	 i) launch app threw selenium web browser, and then inspect the element
	 ii) dont take id if it has space between them or anything other than only name type data
	 iii) start giving priority to locate an element fron 1st method, if it is not present then move to next method
 */

}
