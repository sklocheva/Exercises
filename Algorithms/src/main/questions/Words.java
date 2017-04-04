package main.questions;

public class Words {

	static String[] missingWords(String s, String t) {

		String[] tWords = t.split(" ");
		int sLength = s.split(" ").length;
		String[] words = new String[tWords.length - sLength];
		int counter = 0;
		for (int i = 0; i < tWords.length; i++) {
			if (!(s.contains(tWords[i]))) {
				words[counter] = tWords[i];
				counter++;
			}
		}
		return words;

	}

	static String[] missingWords2(String s, String t) {

		String[] tWords = t.split(s);
		String[] words = new String[t.split(" ").length - s.split(" ").length];

		int counter = 0;
		for (String x : tWords) {
			x = x.trim();
			if (x.contains(" ")) {
				String[] helper = x.split(" ");
				for (String y : helper) {
					words[counter] = y.trim();
					counter++;
				}
			} else {
				words[counter] = x;
				counter++;
			}
		}
		return words;
	}
}
