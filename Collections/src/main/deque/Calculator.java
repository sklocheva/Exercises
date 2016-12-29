package main.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Calculator {

	public int evaluate(String input) {
		final Deque<String> stack = new ArrayDeque<>();
		String[] tokens = input.split(" ");

		for (String token : tokens) {
			stack.add(token);
		}

		while (stack.size() > 1) {
			int left = Integer.parseInt(stack.pop());
			String operator = stack.pop();
			int right = Integer.parseInt(stack.pop());

			switch (operator) {
			case "+":
				stack.push(String.valueOf(left + right));
				break;
			case "-":
				stack.push(String.valueOf(left - right));
				break;
			}
		}
		return Integer.valueOf(stack.pop());
	}
}
