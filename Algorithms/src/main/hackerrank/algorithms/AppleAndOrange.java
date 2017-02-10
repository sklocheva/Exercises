package main.hackerrank.algorithms;

import java.util.Scanner;

public class AppleAndOrange {

	public void solution() {

		Scanner in = new Scanner(System.in);
		int leftRange = in.nextInt();
		int rightRange = in.nextInt();
		int applePos = in.nextInt();
		int orangePos = in.nextInt();
		int appleQ = in.nextInt();
		int orangeQ = in.nextInt();
		int countApple = 0;
		int countOrange = 0;

		// go through all apples and check the condition
		for (int apple_i = 0; apple_i < appleQ; apple_i++) {
			int apple = in.nextInt();
			if ((applePos + apple) >= leftRange && (applePos + apple) <= rightRange) {
				countApple++;
			}
		}

		for (int orange_i = 0; orange_i < orangeQ; orange_i++) {
			int orange = in.nextInt();
			if ((orangePos + orange) >= leftRange && (orangePos + orange) <= rightRange) {
				countOrange++;
			}
		}
		in.close();
		System.out.println(countApple);
		System.out.println(countOrange);
	}
}
