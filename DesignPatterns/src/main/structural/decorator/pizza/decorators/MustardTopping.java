package main.structural.decorator.pizza.decorators;

import main.structural.decorator.pizza.Pizza;

public class MustardTopping extends ToppingDecorator {

	private double hamPrice = 0.55d;
	private String name = "Mustard";

	public MustardTopping(Pizza pizza) {
		super(pizza);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + hamPrice;
	}

	@Override
	public String getDescription() {
		return String.format("%s, %s", super.getDescription(), name);
	}

}
