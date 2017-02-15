package main.structural.decorator.pizza;

import org.junit.Before;
import org.junit.Test;

import main.structural.decorator.pizza.decorators.HamTopping;
import main.structural.decorator.pizza.decorators.MustardTopping;
import main.structural.decorator.pizza.decorators.ToppingDecorator;

public class TestDecoratorExample {
	Pizza pizza;
	ToppingDecorator dec;

	@Before
	public void befre() {
		pizza = new SmallPizza();
	}

	@Test
	public void test() {
		dec = new MustardTopping(pizza);
		System.out.println(dec.getDescription());
		System.out.println(dec.getPrice());

		dec = new HamTopping(dec);
		System.out.println(dec.getDescription());
		System.out.println(dec.getPrice());

	}

}
