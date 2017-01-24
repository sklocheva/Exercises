package main.hackerrank;

public class FindAnagram {
	static boolean isAnagram(String a, String b) {
		int matchFound = 0;
		String c = a + b;
		for (int i = 0; i < c.length(); i++) {
			for (int j = 0; j < c.length(); j++) {
				if ((c.toLowerCase()).charAt(i) == (c.toLowerCase()).charAt(j)) {
					matchFound++;
				}
			}
			if (matchFound % 2 != 0) {
				return false;
			}
			matchFound = 0;
		}
		return true;

	}

}
