package main.builderpattern.sandwichmaker;

import main.builderpattern.sandwichmaker.items.Additive;
import main.builderpattern.sandwichmaker.items.Bread;
import main.builderpattern.sandwichmaker.items.Meat;

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
