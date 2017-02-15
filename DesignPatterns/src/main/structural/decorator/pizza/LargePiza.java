package main.structural.decorator.pizza;

public class LargePiza implements Pizza {

	private double price = 7.99d;
	private String description = "Large pizza";

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
