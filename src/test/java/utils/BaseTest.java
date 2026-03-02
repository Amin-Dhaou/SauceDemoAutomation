package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseTest {
	
	protected static WebDriver driver;
	
	@Parameters({"browserType", "url"})
	@BeforeTest
	public void setUp(String browserType, String url) {
		
		switch(browserType.toUpperCase()) {
		
		case "CHROME":
			driver = new ChromeDriver();
			break;
			
		case "EDGE":
			driver = new EdgeDriver();
			break;
		}
		
		
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
