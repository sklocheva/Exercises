package main.creational.builder.sandwichmaker;

import main.creational.builder.sandwichmaker.items.Additive;
import main.creational.builder.sandwichmaker.items.Bread;
import main.creational.builder.sandwichmaker.items.Meat;

public class CheeseBurger extends SandwichBuilder {

	@Override
	public void addBread() {
		sandwich.setBread(Bread.White);
	}

	@Override
	public void addMeatAndCheese() {
		sandwich.setMeat(Meat.Pork);
		sandwich.setHasCheese(true);
	}

	@Override
	public void addAdditive() {
		sandwich.setAdditive(Additive.ExtraCheese);
		sandwich.setAdditive(Additive.Tomato);
	}

}
