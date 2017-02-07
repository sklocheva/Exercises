package main.builderpattern.sandwichmaker;

import org.junit.Test;
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
