package main.other.recusrion;

/**
 * Illustrates the fibonacci sequence using recursion.
 * 
 * example: : 0, 1, 1, 2, 3, 5, 8, 13, 21
 * 
 * @author Sophie
 *
 */
public class FibonacciRecursion {

	/*
	 * number is which number of the fibonacci sequence to return
	 */
	public int fibonacciSequence(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		// calculates the fibonacci values of the previous sequence numbers
		return fibonacciSequence(number - 1) + fibonacciSequence(number - 2);
	}
}
