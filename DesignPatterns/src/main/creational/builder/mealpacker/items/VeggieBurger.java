package main.creational.builder.mealpacker.items;

import main.creational.builder.mealpacker.packs.Pack;
import main.creational.builder.mealpacker.packs.WrappedType;

public class VeggieBurger extends WrappedType implements Item {

	@Override
	public String name() {
		return "Veggie Burger";
	}

	@Override
	public float price() {
		return 5.85f;
	}

	@Override
	public Pack packing() {
		return new WrappedType();
	}

}
