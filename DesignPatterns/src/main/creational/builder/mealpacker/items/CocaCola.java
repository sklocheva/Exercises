package main.creational.builder.mealpacker.items;

import main.creational.builder.mealpacker.packs.BottleType;
import main.creational.builder.mealpacker.packs.Pack;

public class CocaCola extends BottleType implements Item {

	@Override
	public String name() {
		return "CocaCola";
	}

	@Override
	public float price() {
		return 1.99f;
	}

	@Override
	public Pack packing() {
		return new BottleType();
	}

}
