package main.pluralsight.list;

import java.util.Collections;
import java.util.List;

public class UnmodifiableShoppingBasket<T extends ShipableItem> extends Shipment<T> {

//	private final List<T> basketProducts = new ArrayList<>();
	private int totalWeight = 0;

	@Override
	public void add(T item) {
		// add to the current basket
//		this.basketProducts.add(item);
		// add to all shipment items through inheritance
		super.products.add(item);
		totalWeight = totalWeight + item.getWeight();
	}

	public List<T> getItems() {
		// restrains from modifying the list outside this class
		return Collections.unmodifiableList(super.products);
	}

	@Override
	public String toString() {
		return String.format("Items %s total weight %d.", super.products, totalWeight);
	}

}
