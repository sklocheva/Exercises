package main.creational.builder.mealpacker;

import main.creational.builder.mealpacker.items.Pepsi;
import main.creational.builder.mealpacker.items.VeggieBurger;

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
