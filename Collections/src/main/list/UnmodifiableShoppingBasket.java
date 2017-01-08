package main.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.Product;

public class UnmodifiableShoppingBasket {

	private final List<Product> items = new ArrayList<>();
	private int totalWeight = 0;

	public void addProduct(Product item) {
		items.add(item);
		totalWeight = totalWeight + item.getWeight();
	}

	public List<Product> getItems() {
		//restrains from modifying the list outside this class
		return Collections.unmodifiableList(items);
	}

	@Override
	public String toString() {
		return String.format("Items %s total weight %d.", items, totalWeight);
	}

}
