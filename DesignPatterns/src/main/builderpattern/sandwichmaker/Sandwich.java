package main.builderpattern.sandwichmaker;

import java.util.ArrayList;
import java.util.List;

import main.builderpattern.sandwichmaker.items.Additive;
import main.builderpattern.sandwichmaker.items.Bread;
import main.builderpattern.sandwichmaker.items.Meat;

public class Sandwich {
	private Bread bread;
	private boolean hasCheese = false;
	private Meat meat;
	private List<Additive> additives = new ArrayList<Additive>();

	protected void setBread(Bread bread) {
		this.bread = bread;
	}

	protected void setHasCheese(boolean hasCheese) {
		this.hasCheese = hasCheese;
	}

	protected void setMeat(Meat meat) {
		this.meat = meat;
	}

	protected void setAdditive(Additive additive) {
		this.additives.add(additive);
	}

	public void printSandwichItems() {
		System.out.println("Ingredients");
		System.out.println("-------------");
		
		System.out.println("Bread: " + bread);
		if (hasCheese) {
			System.out.println("Cheese");
		}
		System.out.println("Meat: " + meat);
		System.out.print("Additives: ");
		for (Additive x : additives) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}
