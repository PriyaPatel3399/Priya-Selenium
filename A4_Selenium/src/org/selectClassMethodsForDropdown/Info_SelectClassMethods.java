package org.selectClassMethodsForDropdown;

public class Info_SelectClassMethods 
{
	/*first to use methods of select class e have to create object of select class, in this we have to take constructor which accepts WebElement
	   by reff of this select class we can use methods of select class
	   
	   Ex.   	Select dayDropdown = new Select(webElement);----pass reff of welelement located--dropdown
	 			dayDropdown.methodnames();
	
	 ====Selection Methods====
	  1.selectByIndex(int index)
	  2.selectByValue(String value)
	  3.selectByVisibleText(String text)
	  
	   ====DeSelection Methods====
	  1.deselectByIndex(int index)
	  2.deselectByValue(String value)
	  3.deselectByVisibleText(String text)
	  
	  ====Other Operational Methods====
	  1.isMultiple()--boolean---to check dropdown is single or multi select
	  2.getOptions()--List<WebElement>---to get all the options of dropdown, to access it use for loop traverse threw index.value,visibletext
	  3.getAllSelectedOptions()--List<WebElement>---to get all the selected options of dropdown, to access it use for loop traverse threw index.value,visibletext
	  4.getFirstSelectedOption()--WebElement---get first selected option,from selected options which is present now
	    	Ex.String firstOption = multiSelectDD.getFirstSelectedOption().getText();//get first selected option now
			 	 System.out.println("First Option Selected now: "+firstOption);
		
	  **to convert from WelElement to index,value,text for passing in select class methods use logic like**
	    a) List<WebElement> yearOptions = selectYear.getOptions();
 			int yearindex = 0;
			for(WebElement x : yearOptions)
			 {
		 	  	selectYear.selectByIndex(yearindex);//pass index start from 0 nd increse it by 1++
			     yearindex++;
			 }
		b)List<WebElement> monthOptions = selectMonth.getOptions();
		   for(WebElement x : monthOptions)
		   {
			   String monthtext = x.getText();
			   selectMonth.selectByVisibleText(monthtext);
	   		}
	 	c)List<WebElement> dayOptions = selectDay.getOptions();
	   	   for(WebElement x : dayOptions)
	   		{
		   		String dayvalue = x.getAttribute("value");
		   		selectDay.selectByValue(dayvalue);
			}
	 */

}
