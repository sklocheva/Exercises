package main.hackerrank.algorithms;

import java.util.Scanner;

/**
 * The first line contains an integer, , denoting the number of socks. The
 * second line contains space-separated integers describing the respective
 * values.
 * 
 * Print the total number of matching pairs of socks that John can sell.
 * 
 * @author Sophie
 *
 */
public class SockMerchant {
	public void solution() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		int pairs = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] != 0) {
				for (int j = i + 1; j < c.length; j++) {
					if (c[i] == c[j]) {
						pairs++;
						c[j] = 0;
						break;
					}
				}
			}
		}
		System.out.println(pairs);
	}
}
