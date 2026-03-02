package SauceTest;

import org.testng.annotations.Test;

import sauce.CheckoutPage;
import utils.BaseTest;

public class CheckoutPageTest extends BaseTest {
	
	String fname = "amin";
	String lname = "dhaw";
	String pcode = "1234";

	@Test 
	public void CheckoutTest() {
		new CheckoutPage(driver).checkout(fname, lname, pcode);
	}
	
}
