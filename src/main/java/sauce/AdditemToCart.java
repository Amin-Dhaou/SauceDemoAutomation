package sauce;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdditemToCart {


	private final WebDriver driver ;
	private final WebDriverWait wait;
	
	
	public AdditemToCart(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	 
	private final By additemButton = By.id("add-to-cart-sauce-labs-backpack");
	private final By cartIcon = By.cssSelector(".shopping_cart_link");
	private final By itemName = By.cssSelector(".inventory_item_name");
	private String ExpectedItemName = "Sauce Labs Backpack";
	
	
	
	public AdditemToCart addItem() {
		
		driver.findElement(additemButton).click();
		driver.findElement(cartIcon).click();

		return this;
		
	}
	
	public AdditemToCart VerifyItemInCart() {
			
		    WebElement itemElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(itemName));
		    
		    assertEquals(itemElement.getText(),ExpectedItemName, "Confirmation message mistach");
			
	
			return this;
			
		}
	
	
	
	
	
}
