package main.recursion;

public class FibonacciRecursion {

	/*
	 * number is which number of the fibonacci sequence to return
	 */
	public int fibonacciSequence(int number){
		if(number==1||number==2){
			return 1;
		}
		//calculates the fibonacci values of the previous sequence numbers
		return fibonacciSequence(number-1)+fibonacciSequence(number-2);
	}
}
