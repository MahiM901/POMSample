package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Landing_Page;

public class Test_SloganTextinLandingPage extends Hooks {
	//LandingPage landingPage = new LandingPage();
	
	@Test
	public void verifySloganTextinLandingPage() {
		//go to http://it.microtechlimited.com
		navigateURL("http://it.microtechlimited.com");
		//get text of 'Your One Stop Solution' label
		String actualSlogan = getElementText(Landing_Page.slogan);
		
		//verify its text is 'Your One Stop Solution'
		Assert.assertEquals( actualSlogan,"Your One Stop Soloution");
	}
	
	@Test    //end to end testing
	public void verifySloganTextinLandingPageLengthIsLessThan200Chars() {
		//go to http://it.microtechlimited.com
		navigateURL("http://it.microtechlimited.com");
		
		//get text of 'Your One Stop Solution' label
		String actualSlogan = getElementText(Landing_Page.slogan);
		
		//verify its slogan length is less than 200 chars
		Assert.assertTrue( actualSlogan.length() < 200 );
	}
	
	
}
