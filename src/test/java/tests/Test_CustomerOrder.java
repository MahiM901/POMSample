package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerLogin_Page;
import pages.CustomerOrder_Page;
import pages.CustomerProfile_Page;

public class Test_CustomerOrder extends Hooks{
	@Test
	public void verify_CustomerId_inOrderPage() {
		//login as Customer
		CustomerLogin_Page.action_customerLogin();
		
		//click Order Product Menu
		click(CustomerProfile_Page.menu_Order);
		
		//verify customer Id
		String cid = getAttributeValue(CustomerOrder_Page.label_customerId, "value");
		Assert.assertEquals(cid, "4");
	}
}
