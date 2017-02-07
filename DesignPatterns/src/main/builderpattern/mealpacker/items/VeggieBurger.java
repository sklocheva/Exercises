package main.builderpattern.mealpacker.items;

import main.builderpattern.mealpacker.packs.Pack;
import main.builderpattern.mealpacker.packs.WrappedType;

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
