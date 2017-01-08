package main.recursion;

public class FactorialFunction {

	public int factorial(int number) {

		if (number < 0) {
			throw new IllegalArgumentException();
		}
		if (number == 0) {
			return 1;
		}
		
		return number * factorial(number - 1);
	}

}
