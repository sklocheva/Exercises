package main.behavioral.strategy.calculator.operation;

import main.behavioral.strategy.calculator.Strategy;

public class AddOper implements Strategy {

	@Override
	public int doOper(int number1, int number2) {
		return number1 + number2;
	}

}
