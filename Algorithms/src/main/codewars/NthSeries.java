package main.codewars;

/**
 * Your task is to write a function which returns the sum of following series
 * upto nth term(parameter).
 * 
 * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
 * 
 * @author Sophie
 *
 */
public class NthSeries {

	public static String seriesSum(int n) {
		// Happy Coding ^_^
		if (n == 0) {
			return "0.00";
		}

		double sum = 1;
		int number = 4;
		while (n > 1) {
			sum = sum + ((double) 1 / number);
			number = number + 3;
			n--;
		}
		return String.format("%.2f", sum);
	}
}
