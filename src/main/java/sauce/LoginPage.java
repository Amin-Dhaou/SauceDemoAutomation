package sauce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private final WebDriver driver ;
	private final WebDriverWait wait;
	
	private final By usernameField = By.id("user-name");
	private final By passwordField = By.id("password");
	private final By loginButton = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	public void Login(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
		wait.until(ExpectedConditions.urlContains("/inventory.html"));
		
	} 
}
