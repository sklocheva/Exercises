package main.other;

/**
 * Finds the missing words in t from s and returns them.
 * 
 * @author Sophie
 *
 */
public class MissingWords {

	public static String[] missingWords(String s, String t) {
		String[] actualSentence = s.split(" ");
		String[] givenWords = t.split(" ");
		String[] missingWords = new String[actualSentence.length - givenWords.length];
		int index = 0;

		for (String i : actualSentence) {
			if (!(t.contains(i))) {
				missingWords[index] = i;
				index++;
			}
		}
		return missingWords;
	}

}
