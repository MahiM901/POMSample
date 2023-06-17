package pages;
import org.openqa.selenium.By;
import base.Base;

public class CustomerLogin_Page extends Base{
	//Locators
	public static By menu_login = By.xpath("//a[text()='LOG IN']");
	public static By menu_CustomerLogin = By.xpath("//a[text()='Customer Login']");
	public static By text_customerUserId = By.name("mailuid");
	public static By text_customerPassword = By.name("pwd");
	public static By button_customerlogin = By.name("login-submit");
	public static By label_customerWelcome = By.xpath("//h2[2]");
	public static By label_customerId = By.xpath("//h2[1]");
	public static By menu_CustomerLogout = By.xpath("//a[text()='Log Out']");
	
	//Actions
	public static void action_customerLogin() {
		//go to http://it.microtechlimited.com
		navigateURL("http://it.microtechlimited.com");
		
		//click login Menu
		click(CustomerLogin_Page.menu_login);
		
		//click Customer Login menu
		click(CustomerLogin_Page.menu_CustomerLogin);
		
		//enter customer user id
		sendkeys(CustomerLogin_Page.text_customerUserId, "david@gmail.com");
		
		//enter customer password
		sendkeys(CustomerLogin_Page.text_customerPassword, "1234");
		
		//click customer login button
		click(CustomerLogin_Page.button_customerlogin);
	}
	public static void action_customerLogout() {
		//click customer logout menu
		click(CustomerLogin_Page.menu_CustomerLogout);
	}
}
