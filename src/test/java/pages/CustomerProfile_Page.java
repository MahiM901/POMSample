package pages;

import org.openqa.selenium.By;

public class CustomerProfile_Page {
	//Locator
	public static By menu_profile = By.xpath("//a[text()='My Profile']");
	public static By menu_Order = By.xpath("//a[text()='Order Product']");
	
	public static By profile_firstName = By.xpath("//input[@name='firstName']");
	public static By profile_lastName = By.xpath("//input[@name='lastName']");
	
	//Actions
}
