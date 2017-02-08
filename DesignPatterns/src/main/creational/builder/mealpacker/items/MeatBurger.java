package main.creational.builder.mealpacker.items;

import main.creational.builder.mealpacker.packs.Pack;
import main.creational.builder.mealpacker.packs.WrappedType;

public class MeatBurger implements Item {

	
	@Override
	public String name() {
		return "Meat Burger";
	}

	@Override
	public float price() {
		return 7.65f;
	}

	@Override
	public Pack packing() {
		return new WrappedType();
	}

}
