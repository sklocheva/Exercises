package main.set;

import java.util.ArrayList;
import java.util.List;

import main.Product;

public class Supplier {

	private final List<Product> products = new ArrayList<>();
	private String name;

	public Supplier(String name) {
		this.name = name;
	}

	public List<Product> products() {
		return products;
	}

}
