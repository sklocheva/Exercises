package main.codewars;

/**
 * For building the encrypted string: Take every 2nd char from the string, then
 * the other chars, that are not every 2nd char, and concat them as new String.
 * Do this n times!
 * 
 * @author Sophie
 *
 */
public class SimpleEncryption1 {
	public static String encrypt(final String text, final int n) {
		// Your code here
		if ((text == null || text.isEmpty()) || n <= 0) {
			return text;
		}
		StringBuilder left = new StringBuilder();
		StringBuilder right = new StringBuilder();
		StringBuilder finalString = new StringBuilder();

		finalString.append(text);
		int counter = n;
		while (counter > 0) {
			for (int i = 0; i < finalString.length() - 1; i = i + 2) {
				// get every other
				right.append(finalString.charAt(i));
				// get every second
				left.append(finalString.charAt(i + 1));
			}
			// if the number of letters is odd, add the missing odd el.
			if (finalString.length() % 2 != 0) {
				right.append(finalString.charAt(finalString.length() - 1));
			}
			finalString.setLength(0);
			finalString.append(left.toString() + right.toString());
			left.setLength(0);
			right.setLength(0);
			counter--;
		}
		return finalString.toString();
	}

	public static String decrypt(final String encryptedText, final int n) {
		// Your code here
		if ((encryptedText == null || encryptedText.isEmpty()) || n <= 0) {
			return encryptedText;
		}

		StringBuilder finalString = new StringBuilder();
		StringBuilder en = new StringBuilder();
		finalString.append(encryptedText);

		int counter = n;
		while (counter > 0) {
			en.setLength(0);
			en.append(finalString.toString());
			finalString.setLength(0);
			int half = en.length() / 2;
			for (int i = 0; i < half; i++) {
				finalString.append(en.charAt(half + i));
				finalString.append(en.charAt(i));
			}
			// if the length is non divisable by 2, add left el.
			if (en.length() % 2 != 0) {
				finalString.append(en.charAt(en.length() - 1));
			}
			counter--;
		}
		return finalString.toString();
	}
}
