package main.hackerrank.stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

	public void solution() {
		Scanner in = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		Stack<String> stack = new Stack<String>();
		
		int q = in.nextInt();
		
		while (q > 0) {
			int command = in.nextInt();
			
			switch (command) {
			case 1:
				stack.push(s.toString());
				s.append(in.next());
				break;
			case 2:
				stack.push(s.toString());
				s.delete(s.length() - in.nextInt(), s.length());
				break;
			case 3:
				System.out.println(s.charAt(in.nextInt() - 1));
				break;
			case 4:
				s.delete(0, s.length());
				s.append(stack.pop());
				break;
			}
			q--;
		}
		in.close();
	}
}
