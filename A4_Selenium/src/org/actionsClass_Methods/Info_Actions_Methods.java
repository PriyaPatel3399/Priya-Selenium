package org.actionsClass_Methods;

public class Info_Actions_Methods
{
	/*===Actions Class===
	 	This class is use to perform mouseover & keyboard actions, by using methoads.
	 	
	 	Constructor: ----Actions(WebDriver driver)---this cons. will accept driver ref as argument
	 	                    Ex. Actrions actions = new Actions(driver);--by using this actions. ref we can use methos of Actions class
	 	                    
	 ====Pause action====
	 pause(long miliseconds);--pause script passing miliseconds lke thred.sleep--Ex.3000
	 pause(Duration.ofSeconds(sec));--pause script by pasing durations in the form of seconds directly--Ex.3
	 to pause the page we use (ctrl+/) in inspected html code	                    
	 =====MouseHover actions=====
	 *use .perform() after use any methods of Actions class to perfoem any action is mandatory
	 ##MouseHover Actions##
	 1)moveToElement(WebElement targetElement).perform();---Actions(C)---use to mousehover on any element by passing element ref.
	 2)moveByOffset(int xOffset, int yOffset).perform();---Actions(C)---use to mousehover on any element by passing offsets (x,y)
	 																											   it will count from where cursor present now
	 3)moveByLocation(int x, int y).perform();---Actions(C)---use to mousehover on any element by passing coordiates (x,y)
	 
	 ======Click actions[Left]======
	 4)click(WebElemeent targerElement).perform()--Actions(C)--use to click on any web element by passing element ref.
	 5)click()---Actions(C)--use to click,where we have mousehovered the cursor already--Ex.actions.moveToElement(element_ref).click().perform()
	 
	  ======Click actions[Right]======
	 6)contextClick(WebElemeent targerElement).perform()--Actions(C)--use to right click on any web element by passing element ref.
	 7)contextClick()---Actions(C)--use to right click,where we have mousehovered the cursor already--Ex.actions.moveToElement(element_ref).contextClick().perform()
	 
	  ======Double Click actions======
	 8)doubleClick(WebElemeent targerElement).perform()--Actions(C)--use to doubleclick on any web element by passing element ref.
	 9)doubleClick()---Actions(C)--use to doubleclick,where we have mousehovered the cursor already--Ex.actions.moveToElement(element_ref).doubleClick().perform()
	 
	 =======Drag&Drop actions=======
	 10)dragAndDropBy(WebElement targetElement, int xOffset, int yOffset).perform()---Action(C)---use to drag nd drop by passing (element ref,  X, Y) offsets
	 11)dargAndDrop(WebElement sourceEle, WebElement targetEle).perform()--Action(C)--use to drag nd drop by passing source & target element ref.
	 12)clickAndHold(WebElement targetElement).perform()---Actions(C)--use to click nd hold by passing targetElement ref.
	 13)clickAndHold().perform()--Actions(C)---use to click nd hold,where we have mousehovered the cursor already--
	 																										Ex.actions.moveToElement(element_ref).clickAndHold().perform()
	 14)release(WebElement targetElement).perform()--Actions(C)---use to release by passing targetElement ref,which we already dragAndHold()
	 15)release().perform()--Actions(C)----use to release where we had mousehover already,which we  dragAndHold()
	 
	 ======Scrolling Actions=======
	 16)scrollByAmount(deltaX, deltaY)---Actions(C).perform()--use to scroll from where cursor is present now, by passing offsets,mostly use only Y to scrolldown
	 17)scrollToElement(WebElement targetElement).perform()---ActionsC)---use to scroll page,whrere targetElement is present
	 18)scrollFromOrigin(ScrollOrigin scrollOrigin, deltaX, deltaY).perform()---Actions(C)--it is a combination of above two methods,
	 																													//to create obj of this class use static factory method ScrollOrigin.fromElement(eleref);
	 																													//then pass offsets to move it little more
	 																											Ex. actions.scrollFromOrigin(ScrollOrigin.fromElement(wakad), 0, 90).perform();    
	 		
	======KeyBoard Action======= 	
	19)sendKeys(WebElement targetElement, CharSeq...date)---Actions(C)--pass data to element, by passing element ref and data
	20)sendKeys( string data)---Actions(C)---first moveToElement() then,pass data by sendKeys(data)
	21)keyDown(CharSequence Key)---Actions(C)--use to press ay key of keyboard nd perform any action like click,etc
	22)keyUp(CharSequence key)---Action(C)---use to release pressed key of keyboard ,which is pressed by keyDown() method
	23)build()---Action(C)--add all the actions in one object, and build as one action,to perform diff above actions
	24)perform()---Actionc(C)---perform all the actions,which is added in one object as a one action by using build()
												//now build method is present(called automaticly) inside perform() method ,so we are not using build() separatly
																											
	 ====Pause action====
	25) pause(long miliseconds);--pause script passing miliseconds lke thred.sleep--Ex.3000
	26) pause(Duration.ofSeconds(sec));--pause script by pasing durations in the form of seconds directly--Ex.3
	 to pause the page we use (ctrl+/) in inspected html code	            																										
	 
	 */
	
	

}
