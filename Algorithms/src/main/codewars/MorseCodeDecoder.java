package main.codewars;

public class MorseCodeDecoder {
	public static String decode(String morseCode) {
		// your brilliant code here, remember that you can access the preloaded
		// Morse code table through MorseCode.get(code)
		String[] arr = (morseCode.trim()).split(" ");
		StringBuilder s = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("")) {
				s.append(" ");
				i++;
			} else {
				// s.append(MorseCode.get(arr[i]));
			}
		}
		return s.toString();
	}
}
