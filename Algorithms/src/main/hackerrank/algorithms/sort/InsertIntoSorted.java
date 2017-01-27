package main.hackerrank.algorithms.sort;

public class InsertIntoSorted {
	public static void insertIntoSorted(int[] ar) {

		for (int i = 1; i < ar.length; i++) {
			int a = ar[i];
			int j = i;
			while (j > 0 && a < ar[j - 1]) {
				ar[j] = ar[j - 1];
				j--;
				printArray(ar);
			}
			ar[j] = a;
		}
		printArray(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
