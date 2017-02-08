package main.creational.builder.sandwichmaker;

import org.junit.Test;

import main.creational.builder.sandwichmaker.CheeseBurger;
import main.creational.builder.sandwichmaker.Sandwich;
import main.creational.builder.sandwichmaker.SandwichBuilder;
import main.creational.builder.sandwichmaker.SandwichDirector;
/**
 * 
 * @author Sophie
 *
 */
public class TestBuilderPatternSanwichMaker {

	SandwichDirector maker;
	SandwichBuilder builder;
	Sandwich sandwich;
	
	@Test
	public void test() {
		builder = new CheeseBurger();
		maker = new SandwichDirector(builder);
		
		sandwich = maker.createSandwich();
		sandwich.printSandwichItems();
	}

}
