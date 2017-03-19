package main.codewars;

/**
 * Write a function that receives two strings and returns n, where n is equal to
 * the number of characters we should shift the first string forward to match
 * the second.
 * 
 * @author Sophie
 *
 */
public class CalculateRotation {
	static int shiftedDiff(String first, String second) {
		int counter = 0;
		int length = first.length();
		StringBuilder before = new StringBuilder();
		before.append(first);
		StringBuilder after = new StringBuilder(before);
		while (length > 0) {
			if (second.equals(after.toString())) {
				return counter;
			}
			before.setLength(0);
			before.append(after);
			after.setLength(0);
			counter++;
			// append last character
			after.append(before.charAt(before.length() - 1));
			// append the rest after that the last
			for (int i = 0; i < first.length() - 1; i++) {
				after.append(before.charAt(i));
			}
			length--;
		}
		// if there are not the same
		return -1;
	}

	static int shiftedDiff2(String first, String second) {
		if (first.length() != second.length()) {
			return -1;
		}
		return (second + second).indexOf(first);
	}
}
