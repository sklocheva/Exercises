package main.creational.builder.mealpacker.items;

import main.creational.builder.mealpacker.packs.Pack;

public interface Item {

	public Pack packing();

	public String name();

	public float price();
}
