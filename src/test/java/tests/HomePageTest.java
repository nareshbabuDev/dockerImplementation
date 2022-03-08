package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GoogleHomePage;

public class HomePageTest extends BaseTest{
	
	@Test
	public void searchTest() {
		
		GoogleHomePage gp = new GoogleHomePage(driver);
		gp.launch();
		gp.isDisplayed();
		Assert.assertEquals(1,1);
	}

}
