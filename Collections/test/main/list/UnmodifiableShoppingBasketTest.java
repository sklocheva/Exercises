package main.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static main.ProductFixtures.*;

public class UnmodifiableShoppingBasketTest {

	UnmodifiableShoppingBasket basket;

	@Before
	public void before() {
		basket = new UnmodifiableShoppingBasket();
	}

	@Test
	public void addOneElement() {
		basket.addProduct(door);
		Assert.assertEquals("Items [Product {name = Wooden Door, weight = 35}] total weight 35.",
							basket.toString());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void addElementFromOutsideClass() {
		//add from inside the class through the method addProduct
		basket.addProduct(door);
		//add from outside by adding directly to the returned List
		basket.getItems().add(panel);
	}

}
