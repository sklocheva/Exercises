package main.builderpattern.mealpacker.items;

import main.builderpattern.mealpacker.packs.Pack;

public interface Item {

	public Pack packing();

	public String name();

	public float price();
}
