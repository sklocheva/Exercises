package main.structural.decorator.pizza.decorators;

import main.structural.decorator.pizza.Pizza;

public class ToppingDecorator implements Pizza{
	protected Pizza pizza;

	protected ToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public double getPrice() {
		return pizza.getPrice();
	}

	@Override
	public String getDescription() {
		return pizza.getDescription();
	}
	
	
}
