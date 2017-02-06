package main.pluralsight.deque;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.pluralsight.deque.Calculator;

public class CalculatorTest {
	Calculator calc;
	int result;

	@Before
	public void before() {
		calc = new Calculator();
	}

	@Test
	public void addOne() {
		result = calc.evaluate("1");
		Assert.assertEquals(1, result);
	}

	@Test
	public void add() {
		result = calc.evaluate("1 + 2");
		Assert.assertEquals(3, result);
	}

	@Test
	public void subtract() {
		result = calc.evaluate("1 - 2");
		Assert.assertEquals(-1, result);
	}

	@Test
	public void complexStatement() {
		result = calc.evaluate("1 - 2 + 3 - 4");
		Assert.assertEquals(-2, result);
	}

}
