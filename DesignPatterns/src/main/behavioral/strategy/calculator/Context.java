package main.behavioral.strategy.calculator;

/**
 * The Context behavior will depend on the chosen strategy.
 * 
 * @author Sophie
 *
 */
public class Context {
	Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public int calculate(int number1, int number2) {
		return strategy.doOper(number1, number2);
	}
}
