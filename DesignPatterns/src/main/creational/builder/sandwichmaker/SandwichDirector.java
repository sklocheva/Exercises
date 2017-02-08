package main.creational.builder.sandwichmaker;

public class SandwichDirector {
	SandwichBuilder builder;

	public SandwichDirector(SandwichBuilder builder) {
		this.builder = builder;
	}

	public Sandwich createSandwich() {
		
		builder.addBread();
		builder.addMeatAndCheese();
		builder.addAdditive();

		return builder.getSandwich();
	}

}
