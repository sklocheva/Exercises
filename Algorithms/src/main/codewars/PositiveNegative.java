package main.codewars;

public class PositiveNegative {

	public static int[] countPositivesSumNegatives(int[] input) {
		if (input == null || input.length == 0) {
			return new int[] {};
		}
		int countPos = 0;
		int sumNeg = 0;
		for (int x : input) {
			if (x > 0) {
				countPos++;
			} else if (x < 0) {
				sumNeg = sumNeg + x;
			}
		}
		return new int[] { countPos, sumNeg };
	}
}
