package main.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import main.Product;

public class Shipment {

	private static final int MAX_WEIGHT = 20;

	private final List<Product> products;
	private List<Product> heavyProducts;
	private List<Product> lightProducts;

	public Shipment() {
		products = new ArrayList<>();
	}

	public void add(Product item) {

		products.add(item);
	}

	public boolean contains(Collection<Product> items) {
		return products.containsAll(items);
	}

//	public Iterator<Product> iterator() {
//		return products.iterator();
//	}

	public void replace(Product oldItem, Product newItem) {

		final int index = products.indexOf(oldItem);
		if (index != -1) {
			products.set(index, newItem);

		}

	}

	public void prepare() {
		heavyProducts = new ArrayList<>();
		lightProducts = new ArrayList<>();

		for (Product product : products) {
			if (product.getWeight() > MAX_WEIGHT) {
				heavyProducts.add(product);
			} else {
				lightProducts.add(product);
			}
		}
	}

	public List<Product> getHeavyList() {
		return heavyProducts;
	}

	public List<Product> getLightList() {
		return lightProducts;
	}

}
