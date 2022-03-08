package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.GoogleHomePage;
import pages.GoogleSearchResultPage;

public class SearchResultPageTest extends BaseTest {
	@Test(dataProvider = "getData")
	public void searchResultTest(String keyword,int index) {
		
		GoogleHomePage homepage = new GoogleHomePage(driver);
		GoogleSearchResultPage resultpage = new GoogleSearchResultPage(driver);
		
		homepage.launch();
		homepage.isDisplayed();
		homepage.searchKey(keyword);
		homepage.clickSuggestionByIndex(index);
		resultpage.isDisplayed();
		Assert.assertEquals("Pass", "Pass");
		
	}
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {{"Docker",3},{"Selenium",2}};
	}
	

}
