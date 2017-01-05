package main.set;

import java.util.ArrayList;
import java.util.List;

import main.Furniture;
import main.list.ShipableItem;

public class Supplier {

	private final List<ShipableItem> products = new ArrayList<>();
	private String name;

	public Supplier(String name) {
		this.name = name;
	}

	public List<ShipableItem> products() {
		return products;
	}

}
