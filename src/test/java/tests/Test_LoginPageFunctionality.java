package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerLogin_Page;

public class Test_LoginPageFunctionality extends Hooks{
	
	@Test
	public void verify_customerLoginwithValidLoginPassword() {
		//login as Customer
		CustomerLogin_Page.action_customerLogin();
		
		//verify Welcome message
		String wc = getElementText(CustomerLogin_Page.label_customerWelcome);
		Assert.assertEquals( wc,"Welcome David");
		
		//logout as Customer
		CustomerLogin_Page.action_customerLogout();
				
	}
	
	
	@Test
	public void verify_customerIdAtCustomerHomePage() {
		//login as Customer
		CustomerLogin_Page.action_customerLogin();
		
		//verify Customer ID
		String customer_id = getElementText(CustomerLogin_Page.label_customerId);
		Assert.assertEquals( customer_id,"Customer Id: 4");
		
		//logout as Customer
		CustomerLogin_Page.action_customerLogout();		
	}
	
	
}
