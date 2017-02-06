package main.pluralsight.list;

import static main.pluralsight.ProductFixtures.door;
import static main.pluralsight.ProductFixtures.panel;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.pluralsight.Product;
import main.pluralsight.list.UnmodifiableShoppingBasket;

public class UnmodifiableShoppingBasketTest {

	UnmodifiableShoppingBasket<Product> basket;

	@Before
	public void before() {
		basket = new UnmodifiableShoppingBasket<Product>();
	}

	@Test
	public void addOneElementAndCallContainsFromSuper() {
		basket.add(door);
		System.out.println(basket.contains(Arrays.asList(door)));
		
//		Assert.assertEquals("Items [Product {name = Wooden Door, weight = 35}] total weight 35.",
//							basket.toString());
	}
	
	@Test
	public void addOneElement() {
		basket.add(door);
		Assert.assertEquals("Items [Product {name = Wooden Door, weight = 35}] total weight 35.",
							basket.toString());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void addElementFromOutsideClass() {
		//add from inside the class through the method addProduct
		basket.add(door);
		//add from outside by adding directly to the returned List
		basket.getItems().add(panel);
	}

}
