package SauceTest;

import org.testng.annotations.Test;

import sauce.AdditemToCart;
import utils.BaseTest;



public class AdditemToCartTest extends BaseTest{
	@Test
	public void additemToCartTest() {
		AdditemToCart additem = new AdditemToCart(driver);
		additem.addItem().VerifyItemInCart();
	}

}
