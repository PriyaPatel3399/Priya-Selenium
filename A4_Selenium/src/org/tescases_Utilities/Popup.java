package org.tescases_Utilities;

import org.genericUtilities.BaseClass;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Popup extends BaseClass
{
	@Test
	public void handlePopup()
	{
		driver.get("http://omayo.blogspot.com/");
		Alert alert = driver.switchTo().alert();
		alert.accept();//click on OK button of alert pop-up
		Assert.fail();
	}
}
