package org.iframe;

public class Info_iframe_Methods 
{
	/*   iframe---html structure inside main html
	 					we can't loate it directly, we have switch our control to that iframe structure, by using its locator
	 					first search ----//iframe in htmlcode,then locate it
	 				
	 =====switch in iframe======
	 use driver.switchTo().frame()
	 1. frame(int index)---WeDriver---use index to switch into iframe
	 2. frame(string nameORid)---WebDriver---use to switch to frame by passing frame id or name
	 3. frame(WebElement frame)---WebDriver---use to switch to frame by passing its locator as webElement
	 4. defaultContent()---WebDriver---use to switch out the control , back to default(main) page
	 5. parentFrame()---WebDriver---use to switch out the control, back to pent frame from its child frame,  for nested frame
	 */
}
