package org.searchContextMethods;

public class Xpath_dif_Ways 
{
	/*8)xpath(String xpathExpression)--By--locate an element using xpath,in this we are using relative xpath(//lastTagname)
	 	
	 	1) xpath by attribute---xpath("//tagname[@attname='attvalue']")--ex. //input[@placeholder='Email adress or phone number']
	 	                                                                                                                    //input[@data-testid='royal_email']
	 	
	 	2) xpath by text()------xpath("//tagnname[text()='visible_text']")--ex. //a[text()='Register']------linkText---
	 	                                                                                                                    //label[text()='Email:']---visibleText--
	 	                                     *  when we locate any text, we have to store it in WebElemnt, with its ref use .getText() store in in String, nd print it
	 	                                        Ex.  WebElement emailLabel = driver.findElement(By.xpath("//label[text()='Email:']"));
													   String  text = emailLabel.getText();
													   System.out.println(text);
	 	                                      *  if we want to locate from any parent tag, then use "." at the place of text()--ex. xpath(//parentTag[.='visible_text'])                                                                              
		                                                                                                                                                                                   //div[.='Register']
		 3) xpath by contains()---xpath("//tagname[cotains(text(),'partial_Text')]")----for partial text or linktext---                                                                                                                                                                                                              
	 	                                                     //h1[contains(text(),'Welcome')])---if text then use getText n print to check      
	 	                                          xpath("//tagname[cotains(@attname,'partial_attvalue')]")----for partial attvalue----
	 	                                                      //img[contains(@title,'category Cell phones')]     
	 	                                                       
	 	4) xpath by starts-with()---xpath("//tagname[starts-with(text(),'starting_Text')]")---for partial text or linktext---  
	 	                                             xpath("//tagname[starts-with(.,'starting_text')]")----for partial text or linktext---replace text() with .       
	 	                                             xpath("//tagname[starts-with(@attname,'starting_attvalue')]")----for partial attvalue---          
	 	                                               
	 	 5) xpath by ends-with()---xpath("//tagname[ends-with(text(),'ending_Text')]")---for partial text or linktext---  
	 	                                            xpath("//tagname[ends-with(.,'ending_text')]")----for partial text or linktext---replace text() with .       
	 	                                            xpath("//tagname[ends-with(@attname,'endting_attvalue')]")----for partial attvalue---               
	 	                                               
	 	6) xpath by logical_Operator---xpath("//tagname[ Operand1 logicalOperator Operand2')]")
	 	                                                   we can use operand like @attname= 'attvalue',  text()='text',  starts-with(),  ends-with()
	 	                                                   xpath("//tagname[@attname='attvalue' and @attname='attvlue')]")---for and  operator---
	 	                                                   xpath("//tagname[@attname='attvalue' or @attname='attvlue')]")------for or operator---use when we have dought on att
	 	                                                    locating base on two attribute when, we have duplicate atributes     
	 	            
	 	7) xpah by Axes--------------traverse to tags
	 												 a) parent-(/..)
	 	                                             b) child--(/)
	 	                                             c) ancesttor--
	 	                                             d) descendent--(//)
	 	                                             e) preceding-sibling--
	 	                                             f) following-sibling--
	 	                                             xpath("//tagname[@attname='attvalue']/axes_name::tagname[strategy]")
	 	                                       Ex. xpath("//div[@class='Mammal']following-sibling::div[@class='Other']")
	 8) xpath by dependant independant-----Whenever we have "n" number of duplicates, we can remove duplicates by traversing to that
	  																desired element through one independent element We have to find one genuine element as independent element
 													##Steps to write dependent independent xpath:
													1. Write xpath for independent element (make sure it is 1 of 1, or make sure it is Genuine) 
													2.Use /.. or parent axes to traverse backward until we find a common parent for both dependent (desired element which is duplicate)
													    as well as independent element
													3. Use descendant or / to traverse forward to the desired element.......If you follow above steps we can remove duplicates 
	 */

}
