package org.webDriverMethods;

public class Info_Methods
{
	/*====WebDriver 11 Methods====
	 
	 1) get(String url)--void--navigate into webapp
	 2)getTitle()--String---give title of webapp
	 3)getCurrentUrl()--String--give url of current webapp,where control is present ow
	 4)getPageSourceCode()--String---give page source code of webapp(page)
	 5)getWindowHandle()--String---give window id of current opened window
	 6)navigate()--Navigation<<I>>--1.back()--click on back button of webpage
	 														2.forward()--click on next button of webpage
	 														3.refresh()--click on refresg button of webpage
	 														4.to("url")--navigate into webapp by giving url in the form of stirng
	 														5.to(new URL("url"))--navigate into webapp by giving url in the form of URL object
   	 7)manage()--Options<<I>>--manage().windows().---1.maximize()--maximize the screen
   	 																					  	2.minimize()--minimize the screen
   	 																					  	3.fullscreen()--convert to full screen
   	 																					  	4.getSize()--give size of the webpage in the form of (Width,Height)
   	 																					  	5..setSize(Width,Height)--set size of the webpage in the form of (Width,Height)
   	 																					  	6.getPosition()--give position of the webpage in the form of (x,y)
   	 																					  	7.setPosition(X,Y)--set position of the webpage in the form of (x,y)
   	 8)switchto()--TargetLocator<<I>>---1.activeElement()--transfer the control to active element of the web page
   	 															 2.newWindow(WindowType.TAB)--open the new tab in the browser
   	 															 3.newWindow(WindowType.WINDOW)--open the new window in the browser
   	 															 4.window(String windowID)--transfer th control to passed windowid
    9)getWindowHamdles()--Set<String>--get the all windowids of all the opened tab---print use for each loop--switch base on url nd title use if in foreach loop
   10)close()--to close current openend tab
   11)quit()--to close all the tabs or windows
   	 															 					  	
   	 
	 
	 */

}
