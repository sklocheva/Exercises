package main.hackerrank.algorithms;

import java.util.Scanner;

public class TimeConversion {
	public void solution() {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		char check = s.charAt(8);
		int h = Integer.parseInt(s.substring(0, 2));
		if (check == 'A') {
			if (h != 12) {
				System.out.print(s.substring(0, 8));
			}
			if (h == 12) {
				h = 0;
				System.out.print("0" + h + s.substring(2, 8));
			}
		} else {
			if (h < 12) {
				h += 12;
				System.out.print(h + s.substring(2, 8));
			} else {
				if (h == 12) {
					System.out.print(s.substring(0, 8));
				}
			}
		}
	}
}
