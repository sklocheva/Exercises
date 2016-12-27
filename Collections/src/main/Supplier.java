package main;

import java.util.ArrayList;
import java.util.List;

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
