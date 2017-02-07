package main.builderpattern.mealpacker.items;

import main.builderpattern.mealpacker.packs.BottleType;
import main.builderpattern.mealpacker.packs.Pack;

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
