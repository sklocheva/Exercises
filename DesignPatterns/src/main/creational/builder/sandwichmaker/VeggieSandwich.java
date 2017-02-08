package main.creational.builder.sandwichmaker;

import main.creational.builder.sandwichmaker.items.Additive;
import main.creational.builder.sandwichmaker.items.Bread;
import main.creational.builder.sandwichmaker.items.Meat;

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
