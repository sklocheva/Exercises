package main.creational.builder.mealpacker;

import main.creational.builder.mealpacker.items.CocaCola;
import main.creational.builder.mealpacker.items.MeatBurger;

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
