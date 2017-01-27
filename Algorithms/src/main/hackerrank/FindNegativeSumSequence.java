package main.hackerrank;

public class FindNegativeSumSequence {

	public static int find(int[] arr) {
		int negativeArr = 0;

		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				sum = sum + arr[j];
				// check every time you add
				if (sum < 0) {
					negativeArr++;
				}
			}
			if (arr[i] < 0) {
				negativeArr++;
			}

		}
		return negativeArr;
	}
}
