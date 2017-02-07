package main.builderpattern.sandwichmaker;

import main.builderpattern.sandwichmaker.items.Additive;
import main.builderpattern.sandwichmaker.items.Bread;
import main.builderpattern.sandwichmaker.items.Meat;

public class VeggieSandwich extends SandwichBuilder{

	@Override
	public void addBread() {
		sandwich.setBread(Bread.Oat);
	}

	@Override
	public void addMeatAndCheese() {
		sandwich.setMeat(Meat.Veggie);
	}

	@Override
	public void addAdditive() {
		sandwich.setAdditive(Additive.Lettuce);
		sandwich.setAdditive(Additive.Tomato);
	}

}
