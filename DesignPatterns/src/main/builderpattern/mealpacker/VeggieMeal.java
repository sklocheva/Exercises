package main.builderpattern.mealpacker;

import main.builderpattern.mealpacker.items.Pepsi;
import main.builderpattern.mealpacker.items.VeggieBurger;

public class VeggieMeal implements MealBuilder {
	
	protected Meal meal;

	public VeggieMeal() {
		meal = new Meal();
	}
	@Override
	public Meal createMeal() {
		meal.addItem(new VeggieBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
