package main.hackerrank.javadatastructures;

import java.util.Scanner;
import java.util.Stack;

/*
 * For each case, print 'true' if the string is balanced, 'false' otherwise.

	Sample Input
	
	{}()
	({()})
	{}(
	[]
	Sample Output
	
	true
	true
	false
	true
 * 
 */
public class JavaStack {

	public static void solution() {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			if (input == null) {
				System.out.println("true");
				continue;
			}

			char[] charArr = input.toCharArray();
			Stack<Character> characters = new Stack<Character>();
			for (char i : charArr) {
				if (i == '{' || i == '(' || i == '[') {
					characters.push(i);
				} else if (i == '}' || i == ')' || i == ']') {
					// check if the closing bracket correspond to the previous
					// pushed, if the stack is empty, push the closing bracket
					// and stop the loop
					if (!characters.empty()) {
						if (peekStack(characters.peek(), i)) {
							characters.pop();
						} else {
							continue;
						}
					} else {
						characters.push(i);
						continue;
					}
				}
			}
			if (characters.empty()) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
		sc.close();

	}

	private static boolean peekStack(char peeked, char actual) {
		if (actual == '}' && peeked == '{') {
			return true;
		}
		if (actual == ')' && peeked == '(') {
			return true;
		}
		if (actual == ']' && peeked == '[') {
			return true;
		}
		return false;
	}

}
