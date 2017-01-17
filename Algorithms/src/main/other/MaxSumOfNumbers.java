package main.other;

/**
 * Finds the two numbers in the sequence that have the greatest sum.
 * 
 * @author Sophie
 *
 */
public class MaxSumOfNumbers {

	public static int[] findMax(int N, int[] numbers) {
		int[] arrayMaxSum = new int[2];

		int maxNumber = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				int currentNumber = numbers[i] + numbers[j];

				if (maxNumber < currentNumber) {
					maxNumber = currentNumber;
					arrayMaxSum[0] = numbers[i];
					arrayMaxSum[1] = numbers[j];
				}
			}
		}
		// descending order
		if (arrayMaxSum[0] < arrayMaxSum[1]) {
			int temp = arrayMaxSum[0];
			arrayMaxSum[0] = arrayMaxSum[1];
			arrayMaxSum[1] = temp;
		}

		return arrayMaxSum;

	}
}
