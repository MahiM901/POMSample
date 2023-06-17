package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerLogin_Page;
import pages.CustomerProfile_Page;

public class Test_CustomerProfile extends Hooks{
	
	@Test
	public void verify_CustoemrPrfileName() {
		//login as Customer
		CustomerLogin_Page.action_customerLogin();
		
		//click profile menu
		click(CustomerProfile_Page.menu_profile);

		//Verify Customer First name
		String lastName = getAttributeValue( CustomerProfile_Page.profile_lastName, "value") ;
		
		Assert.assertEquals( lastName,"Smith");
		
		//logout as Customer
		CustomerLogin_Page.action_customerLogout();		
	}
	
	
	
}
