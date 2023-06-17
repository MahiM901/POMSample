package tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class Hooks extends Base {

	@BeforeSuite
   public void beforesuite(){
	 System.out.println("@BeforeSuite");
   }
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(false);
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	public void beforeclass(){
		System.out.println("@BeforeClass");
	}
    @BeforeMethod
	public void beforemetod(){
		System.out.println("@BeforeMethod");
	}
	@Test
	public void beforetest(){
		System.out.println("@Test");
	}
	@AfterMethod
	public void afteremetod(){
		System.out.println("@BeforeMethod");
	}
	@AfterClass
      public void afterClass(){
		System.out.println("@AfterClass");
	}
	@AfterTest
	public void tearDown()  {
		System.out.println("@AfterTest");
		driver.quit();
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("@AfterSuite");
	}

}
