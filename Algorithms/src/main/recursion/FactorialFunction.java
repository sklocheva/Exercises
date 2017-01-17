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

	public int factorialLoop(int number) {

		int sum = 1;
		if (number == 0) {
			return 1;
		}
		
		for (int i = 1; i <= number; i++) {

			sum = sum * i;
		}
		return sum;
	}

}
