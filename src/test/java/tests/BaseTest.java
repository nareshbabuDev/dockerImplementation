package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\nares\\Documents\\Eclipse\\TestDockerImplementation\\drivers\\chromedriver.exe");
		//driver = new ChromeDriver();	
		String host = "localhost";
		DesiredCapabilities capabilities = null;
		capabilities = DesiredCapabilities.chrome();
		if(System.getProperty("BROWSER")!=null && System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
			capabilities = DesiredCapabilities.firefox();
		}
		if(System.getProperty("HUB_HOST")!=null){
			host = System.getProperty("HUB_HOST");
		}
		String completeURL = "https://" + host + ":4444/wd/hub";
		this.driver = new RemoteWebDriver(new URL(completeURL),capabilities);
	}
	
	@AfterTest
	public void tearDown() {
		this.driver.quit();
	}

}
