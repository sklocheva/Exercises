package main.structural.decorator.pizza.decorators;

import main.structural.decorator.pizza.Pizza;

public class HamTopping extends ToppingDecorator {

	private double hamPrice = 1.25d;
	private String name = "Ham";
	
	public HamTopping(Pizza pizza) {
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
