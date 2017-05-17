package main.codewars;

public class DeltaBits {
	public static int convertBits(int a, int b) {
		int count = 0;

		while (a > 0 || b > 0) {
			if(a%2 == b%2){
				count++;
			}
			a=a/2;
			b=b/2;
		}
		return count;
	}
	// public static int convertBits(int a, int b) {
	// int a1 = a;
	// int b1 = b;
	// boolean flag;
	// int countChanges = 0;
	//
	// for (int i = a1; i >= 0; i--) {
	// if (a1 > 0) {
	// if (a1 % 2 == 0) {
	// flag = false;
	// } else {
	// flag = true;
	// }
	// a1 = a1 / 2;
	// } else {
	// flag = false;
	// }
	// if (b1 > 0) {
	// if (b1 % 2 == 0 && flag == true) {
	// countChanges++;
	// } else if (b1 % 2 != 0 && flag == false) {
	// countChanges++;
	// }
	// b1 = b1 / 2;
	// } else if (flag == true) {
	// countChanges++;
	// }
	// }
	//
	// return countChanges;
	// }
}
