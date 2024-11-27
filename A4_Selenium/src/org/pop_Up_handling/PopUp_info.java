package org.pop_Up_handling;

public class PopUp_info
{
	/*###Types of Pop-ups#####
	 1. Window pop-up/browser/child window/html Pop-up----it ecxatly look like window(minimize,maximize,close buttons will be there)
	 																								//we can inspect it, to handle it switch the control to it by passing windowId
	 																								  
	 2. Alert pop-up---It has only OK button(Simple/information alert), or OK with Cancel button(conformation alert),or textbox also there(prompt alert)
	 							//it will come at top-middle of the page
	 						    //we can't inspect it, handling is mandtory for this alert
	 							//to handle it, we have to use method alert(), which presnt inside switchTo() of webdriver<I>
	 	*switchTo().alert()---Alert<<I>>--1)accept()--click on OK button of pop-up
	 	*														2)dismiss()--click on Cancel button of pop-up
	 	*														3)sendKeys(data)--pass data to textbox present of pop-up
	 	*														4)getText()--to get present Text in pop-up
	
	 3. Notification pop-up---It has Allow nd Deny(Block) button, we can't inspect it,but we can either Handle Or Avoid it
	 										//It will come under url of the webpage
	 										//to handle it we have to use Robot clas, create obj by (new Robot();)thows Exception
	
	  *To hanle it, use this Robot(C) methods, we have to pass keycode in int form, for that use KeyEvent(C) method---KeyEvent.VK_keyName
	     	  				1)robot.KeyPress(KeyEvent.VK_keyName)--to press the key--Ex.robot.KeyPress(KeyEvent.VK_TAB)
	     	  				2)robot.KeyRelease(KeyEvent.VK_keyName)---to release the pressed key
	  
	   *To avoid it, use ChromeOptions(C),first create obj of it, pass this ogj as an argument in ChromeDriver(options) constructor
	    					//then use ref.addArguments("args") var-argsmethod,
	    					//in this method we can pass dif. commands as desired capabilities in the form of String, to add desired capabilities nd avoid getting pop-up in Chrome browser
	                        //to get list of commands from use this link---https://peter.sh/experiments/chromium-command-line-switches/
	                              Ex. ChromeOptions options = new ChromeOptions();
	                              		options.addArguments("--disable-notifications"); //to not get notification pop-up in browser
	     	  							options.addArguments("--start-maximized"); //to open browser in maximized state directly
	     	  							options.addArguments("--disablenotifications","--start-maximized");//we can add mltiple args also
	     	  							WebDriver driver = new ChromeDriver(options);//pass obj in ChroeDriver() object creation
	     	  							
	 4. File Upload pop-up---we can avoid it, or handle it
	 		    						//we can avoid pop-up nd upload file also,to search file upload button,use//input[@type='file'], then pass path directly in sendkeys()
										//to handle it using AutoIT tool,First open file upload pop-up,
										// focus using Au3Info_64, write script in SciTE like, in this put text empty--""
									 1) ControlFocus("title", "text","contolid(Class+instance) )
									 2)ControlSend("title", "text","contolid(Class+instance),"String-pathof file")
									 3)ControlFocus("title", "text","contolid(Class+instance) )
									 4)ControlClick("title", "text","contolid(Class+instance) )
									 5)then go to tools--try test run--to check scrpit is working or not
									 6) then go to tools--Build---we will get exe file of this script, we click on this script will work
									 7) now connect this autoIT script with selenium script by using--
									      Runtime.getRuntime().exec("path of exe file of AutoIT script");
																 
	 5. File Download pop-up---when e try to dw something will get it ,this also work like FileUpload pop-up only, we can handle or avoid it same as above
	 
	 6. Calendar pop-up/Hidden divison pop-up---	we can inspect it by using depedant xpath, nd handle it
	 																			select todays date, use LocalDateTime class, nd make xpath dynamic by concate it with veriables
	 																	  Ex.LocalDateTime ldt = LocalDateTime.now();
	 																			int date = ldt.getDayOfMonth();//fatch todays date
	 																			String month = ldt.getMonth().name();//fatch presnt month, nd covert it into String by using name()
																				int year = ldt.getYear();//fatch present year
																				
###if we not able to inspect/locate using html###OrDynamic dropdown###
	1)in html code---locate element first then----go to Event listeners---remove blur nd all focus property, then try to inspect we can do it
	2)in html code---locate element firrt then----go to sources---ctrl+/---to pause the screen(also use pause button)


	 */

}
