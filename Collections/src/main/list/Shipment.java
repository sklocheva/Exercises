package main.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A shipment class that ships concrete items of the same type(class) from the
 * ShipableItem interface
 * 
 * @author Sophie
 *
 * @param <T>
 */
public class Shipment<T extends ShipableItem> {

	private static final int MAX_WEIGHT = 20;

	private final List<T> products;
	private List<T> heavyProducts;
	private List<T> lightProducts;

	public Shipment() {
		products = new ArrayList<>();
	}

	public void add(T item) {

		products.add(item);
	}

	public boolean contains(Collection<T> items) {
		return products.containsAll(items);
	}

	// public Iterator<Product> iterator() {
	// return products.iterator();
	// }

	public void replace(T oldItem, T newItem) {

		final int index = products.indexOf(oldItem);
		if (index != -1) {
			products.set(index, newItem);

		}

	}

	public void prepare() {
		heavyProducts = new ArrayList<>();
		lightProducts = new ArrayList<>();

		for (T product : products) {
			if (product.getWeight() > MAX_WEIGHT) {
				heavyProducts.add(product);
			} else {
				lightProducts.add(product);
			}
		}
	}

	public List<T> getHeavyList() {
		return heavyProducts;
	}

	public List<T> getLightList() {
		return lightProducts;
	}

}
