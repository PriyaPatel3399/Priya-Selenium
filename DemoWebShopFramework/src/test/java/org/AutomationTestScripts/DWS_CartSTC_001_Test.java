package org.AutomationTestScripts;

import org.element_repository.CellPhonePage;
import org.element_repository.ElectronicsPage;
import org.element_repository.ProductDescriptionPage;
import org.genericUtilities.BaseClass;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.genericUtilities.MyListeners.class)
public class DWS_CartSTC_001_Test extends BaseClass
{
	
	@Test
	public void verify_user_is_able_to_add_product_to_cart()
	{
		ElectronicsPage electronicspage = new ElectronicsPage(driver);
		CellPhonePage cellphonepage = new CellPhonePage(driver);
		ProductDescriptionPage productdescriptinpage = new ProductDescriptionPage(driver);
		
		//step-1 : click on electronics link
		basepage.getElectronicsaLink().click();
		Reporter.log("Electronics link clicked", true);
		
		//step-2 : click on cell phones
		electronicspage.getCellPhonesLink().click();;
		Reporter.log("Cell phones link clicked", true);

		
		//step-3 : click on smart phone
		cellphonepage.getSmartPhoneLink().click();
		Reporter.log("Smartphones link clicked", true);
		
		//step-4 : cliclk on Adtocart button
		productdescriptinpage.getAddToCartButton().click();
		Reporter.log("product added to cart", true);

	}

}
