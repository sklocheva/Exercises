package main.other;

/**
 * Prints the numbers from 1 to 100 and for every number which is divisible of 3
 * prints Fizz, of 5 - Buzz and of both - FizzBuzz
 * 
 * @author Sophie
 *
 */
public class FizzBuzz {

	public static String[] printNumbers() {
		String[] array = new String[99];
		int index = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				array[index] = "FizzBuzz";
			} else if (i % 3 == 0) {
				array[index] = "Fizz";
			} else if (i % 5 == 0) {
				array[index] = "Buzz";
			} else {

				array[index] = String.valueOf(i);
			}
			index++;
		}
		return array;
	}

}
