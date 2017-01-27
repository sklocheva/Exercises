package main.hackerrank.algorithms;

import java.util.Scanner;

public class MiniMaxSum {

	public void solution() {
		Scanner in = new Scanner(System.in);
		long[] arr = new long[5];
		long sum = 0;
		arr[0] = in.nextLong();
		sum = sum + arr[0];
		arr[1] = in.nextLong();
		sum = sum + arr[1];
		arr[2] = in.nextLong();
		sum = sum + arr[2];
		arr[3] = in.nextLong();
		sum = sum + arr[3];
		arr[4] = in.nextLong();
		sum = sum + arr[4];
		in.close();
		
		long min = sum - arr[0];
		long max = sum - arr[0];

		for (int i = 1; i < 5; i++) {
			if (sum - arr[i] > max) {
				max = sum - arr[i];
			}
			if (sum - arr[i] < min) {
				min = sum - arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
