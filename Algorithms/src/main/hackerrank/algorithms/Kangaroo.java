package main.hackerrank.algorithms;

import java.util.Scanner;

public class Kangaroo {
	public void solution() {

		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		in.close();
		
		if (v2 < v1) {
			int currentV1 = x1;
			int currentV2 = x2;
			for (int i = 0; i < (v1 * 100); i++) {
				if (currentV1 == currentV2) {
					System.out.println("YES");
					break;
				} else if ((currentV1 - v2) > currentV2) {
					System.out.println("NO");
					break;
				}
				currentV1 = currentV1 + v1;
				currentV2 = currentV2 + v2;
			}
		} else {
			System.out.println("NO");
		}
	}

}
