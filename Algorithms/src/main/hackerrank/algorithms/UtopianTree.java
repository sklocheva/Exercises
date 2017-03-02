package main.hackerrank.algorithms;

import java.util.Scanner;

/**
 * The Utopian Tree goes through 2 cycles of growth every year. Each spring, it
 * doubles in height. Each summer, its height increases by 1 meter.
 * 
 * Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of
 * spring. How tall will her tree be after N growth cycles?
 * 
 * The first line contains an integer, , the number of test cases. subsequent
 * lines each contain an integer, , denoting the number of cycles for that test
 * case.
 * 
 * For each test case, print the height of the Utopian Tree after cycles. Each
 * height must be printed on a new line.
 * 
 * @author Sophie
 *
 */
public class UtopianTree {
	public void solution() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n > 0) {
			int tree = 1;
			int cycle = s.nextInt();
			boolean flag = false;

			if (cycle == 0) {
				System.out.println(tree);
				n--;
				continue;
			}
			if (cycle % 2 != 0) {
				flag = true;
				cycle = cycle + 1;
			}
			cycle = cycle / 2;
			while (cycle > 0) {
				tree = tree * 2 + 1;
				cycle--;
			}
			if (flag) {
				tree = tree - 1;
			}
			System.out.println(tree);
			n--;
		}
		s.close();
	}
}
