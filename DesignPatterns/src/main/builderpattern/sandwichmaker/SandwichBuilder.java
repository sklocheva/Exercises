package main.builderpattern.sandwichmaker;

public abstract class SandwichBuilder {

	Sandwich sandwich = new Sandwich();
	
	public abstract void addBread();

	public abstract void addMeatAndCheese();
	
	public abstract void addAdditive();
	
	public Sandwich getSandwich(){
		return sandwich;
	}
}
