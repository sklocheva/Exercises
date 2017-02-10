package main.hackerrank.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {

	public void solution() {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}
		in.close();
		Arrays.sort(a);
		Arrays.sort(b);
		// go through all numbers between the two sets and check for the two
		// conditions
		int countFound = 0;
		for (int currentN = a[a.length - 1]; currentN <= b[0]; currentN++) {
			boolean flagA = true;
			boolean flagB = true;
			// check if currentN is divisible by all of the numbers in a
			for (int x : a) {
				if (currentN % x != 0) {
					flagA = false;
					break;
				}
			}
			// if currentN is true for all in a, than check if all in b are
			// divisible by it
			if (flagA) {
				for (int y : b) {
					if (y % currentN != 0) {
						flagB = false;
						break;
					}
				}
			} else {
				continue;
			}

			if (flagA && flagB) {
				countFound++;
			}
		}

		System.out.println(countFound);
	}
}
