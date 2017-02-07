package main.builderpattern.mealpacker.items;

import main.builderpattern.mealpacker.packs.BottleType;
import main.builderpattern.mealpacker.packs.Pack;

public class Pepsi extends BottleType implements Item {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 1.65f;
	}

	@Override
	public Pack packing() {
		return new BottleType();
	}

}
