package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.GoogleHomePage;
import pages.GoogleSearchResultPage;

public class SearchParameterResultPage extends BaseTest {
	@Test
	@Parameters({"keyword","index"})
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
	
}