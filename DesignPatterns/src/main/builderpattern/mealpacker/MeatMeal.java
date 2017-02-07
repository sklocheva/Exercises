package main.builderpattern.mealpacker;

import main.builderpattern.mealpacker.items.CocaCola;
import main.builderpattern.mealpacker.items.MeatBurger;

public class MeatMeal implements MealBuilder {

	protected Meal meal;

	public MeatMeal() {
		meal = new Meal();
	}

	@Override
	public Meal createMeal() {
		meal.addItem(new MeatBurger());
		meal.addItem(new CocaCola());
		return meal;
	}

}
