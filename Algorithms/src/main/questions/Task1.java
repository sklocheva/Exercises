package main.questions;

public class Task1 {
	private StringBuffer formatted;
	private int length;
	private String dash = "-";

	String str;

	public String solution(String S) {
		// write your code in Java SE 8
		str = S;
		str = str.replaceAll(dash, "");
		str = str.replaceAll(" ", "");
		length = str.length();
		formatted = new StringBuffer();

		if (length % 3 == 0) {
			appendThree();
		} else {
			if (length % 3 > 5) {
				divisableByTwo();
			} else {
				nonDivisable();
			}
		}
		return formatted.toString();
	}

	private void appendThree() {
		for (int i = 0; i < length; i = i + 3) {
			formatted.append(str.charAt(i));
			formatted.append(str.charAt(i + 1));
			formatted.append(str.charAt(i + 2));
			if (length - 1 > i + 3) {
				formatted.append(dash);
			}
		}
	}

	private void divisableByTwo() {
		for (int i = 0; i < length; i = i + 3) {
			if (length - 1 > i + 5) {
				formatted.append(str.charAt(i));
				formatted.append(str.charAt(i + 1));
				formatted.append(str.charAt(i + 2));
				formatted.append(dash);
			} else {
				formatted.append(str.charAt(i));
				formatted.append(str.charAt(i + 1));
				formatted.append(dash);
				formatted.append(str.charAt(i + 2));
				formatted.append(str.charAt(i + 3));
				break;
			}
		}
	}

	private void nonDivisable() {
		for (int i = 0; i < length; i = i + 3) {
			if (length -1 > i + 6) {
				formatted.append(str.charAt(i));
				formatted.append(str.charAt(i + 1));
				formatted.append(str.charAt(i + 2));
				formatted.append(dash);
			} else {
				formatted.append(str.charAt(i));
				formatted.append(str.charAt(i + 1));
				formatted.append(str.charAt(i + 2));
				formatted.append(dash);
				formatted.append(str.charAt(i + 3));
				formatted.append(str.charAt(i + 4));
				break;
			}
		}
	}
}
