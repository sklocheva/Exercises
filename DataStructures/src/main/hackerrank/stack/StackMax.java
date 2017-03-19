package main.hackerrank.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackMax {
	public void solution() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> largest = new Stack<Integer>();
		while (n > 0) {
			int c = s.nextInt();
			switch (c) {
			case 1:
				int num = s.nextInt();
				if (largest.size() == 0) {
					largest.push(num);
				} else if (largest.peek() <= num) {
					largest.push(num);
				}
				stack.push(num);
				break;
			case 2:
				if (largest.peek().equals(stack.pop())) {
					largest.pop();
				}
				break;
			case 3:
				System.out.println(largest.peek());
				break;
			default:
				break;
			}
			n--;
		}
		s.close();
	}
}
