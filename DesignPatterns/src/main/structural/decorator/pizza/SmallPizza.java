package main.structural.decorator.pizza;

public class SmallPizza implements Pizza {

	private double price = 5.55d;
	private String description = "Small pizza";

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
