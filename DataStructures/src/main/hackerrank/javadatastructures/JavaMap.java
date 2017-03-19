package main.hackerrank.javadatastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void solution() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();

			phoneBook.put(name, phone);
			in.nextLine();
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if (phoneBook.get(s) == null) {
				System.out.println("Not found");
			} else {
				System.out.println(s + "=" + phoneBook.get(s));
			}
		}
		in.close();
	}
}
