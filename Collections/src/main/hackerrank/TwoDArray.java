package main.hackerrank;

import java.util.Scanner;

public class TwoDArray {
	public void calc() {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int arr_i = 0; arr_i < 6; arr_i++) {
			for (int arr_j = 0; arr_j < 6; arr_j++) {
				arr[arr_i][arr_j] = in.nextInt();
			}
		}
		int sum = -100;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				int total = arr[j][i] + arr[j][i + 1] + arr[j][i + 2];
				total = total + arr[j + 1][i + 1];
				total = total + arr[j + 2][i] + arr[j + 2][i + 1] + arr[j + 2][i + 2];
				if (sum < total) {
					sum = total;
				}
			}
		}
		System.out.println(sum);
		in.close();
	}
}
