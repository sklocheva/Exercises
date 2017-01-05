package main.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.Furniture;

public class UnmodifiableShoppingBasket {

	private final List<Furniture> items = new ArrayList<>();
	private int totalWeight = 0;

	public void addProduct(Furniture item) {
		items.add(item);
		totalWeight = totalWeight + item.getWeight();
	}

	public List<Furniture> getItems() {
		//restrains from modifying the list outside this class
		return Collections.unmodifiableList(items);
	}

	@Override
	public String toString() {
		return String.format("Items %s total weight %d.", items, totalWeight);
	}

}
