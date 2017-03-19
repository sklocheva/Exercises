package main.hackerrank.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets2 {

	public void solution() {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String open = "([{";

		for (int a0 = 0; a0 < t; a0++) {
			Stack<Character> stack = new Stack<Character>();
			char[] s = in.next().toCharArray();
			
			for (char x : s) {
				//if open bracket
				if (open.contains(String.valueOf(x))) {
					stack.push(x);
				} else if (stack.isEmpty()) { //if first in stack and closing bracket
					stack.push(x);
					continue;
				} else { //if closing bracket
					char openChar = 0;
					switch (x) {
					case ')': openChar = '(';	break;
					case ']':	openChar = '[';	break;
					case '}':	openChar = '{';	break;
					}
					if (stack.peek() == openChar) {
						stack.pop();
					} else {
						continue;
					}
				}
			}
			if (stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		in.close();
	}
}
