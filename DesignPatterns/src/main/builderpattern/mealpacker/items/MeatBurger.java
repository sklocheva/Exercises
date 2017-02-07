package main.builderpattern.mealpacker.items;

import main.builderpattern.mealpacker.packs.Pack;
import main.builderpattern.mealpacker.packs.WrappedType;

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
