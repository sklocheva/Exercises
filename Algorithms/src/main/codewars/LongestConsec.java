package main.codewars;

/**
 * You are given an array strarr of strings and an integer k. Your task is to
 * return the first longest string consisting of k consecutive strings taken in
 * the array.
 * 
 * Example:
 * longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta",
 * "abigail"], 2) --> "abigailtheta"
 * 
 * n being the length of the string array,
 * if n = 0 or k > n or k <= 0 return * "".
 * 
 * @author Sophie
 *
 */
public class LongestConsec {

	public static String longestConsec(String[] strarr, int k) {
		// your code
		if (strarr.length == 0 || k <= 0 || k > strarr.length) {
			return "";
		}
		int maxStart = 0;
		int maxLength = 0;
		int length = 0;
		for (int i = 0; i <= strarr.length - k; i++) {
			// get the length of all till k
			for (int j = i; j < i + k; j++) {
				length = length + strarr[j].length();
			}
			// if true get the starting point
			if (maxLength < length) {
				maxLength = length;
				maxStart = i;
			}
			length = 0;
		}
		// append the full string
		StringBuilder maxString = new StringBuilder();
		int counter = 0;
		while (k != counter) {
			maxString.append(strarr[maxStart + counter]);
			counter++;
		}
		return maxString.toString();
	}
}
