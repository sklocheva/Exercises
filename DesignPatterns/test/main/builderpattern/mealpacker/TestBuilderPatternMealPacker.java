package main.builderpattern.mealpacker;

import org.junit.Test;

/**
 * This class is used to illustrate the Builder pattern example of meal packing.
 * 
 * @author Laptop
 *
 */
public class TestBuilderPatternMealPacker {

	MealBuilder builder;
	Meal meal;

	@Test
	public void testVeggieMeal() {
		builder = new VeggieMeal();
		meal = builder.createMeal();
		meal.showItems();
		System.out.println("------------------");

		builder = new MeatMeal();
		meal = builder.createMeal();
		meal.showItems();
	}

}
