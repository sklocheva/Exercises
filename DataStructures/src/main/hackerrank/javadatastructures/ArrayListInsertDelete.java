package main.hackerrank.javadatastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Print the updated list  as a single line of space-separated integers.

	Sample Input
	
	5
	12 0 1 78 12
	2
	Insert
	5 23
	Delete
	0
	Sample Output
	
	0 1 78 12 23
	
 * @author Sophie
 *
 */
public class ArrayListInsertDelete {

	public void array() {
		Scanner s = new Scanner(System.in);
		int n = Integer.valueOf(s.nextLine());
		String[] values = s.nextLine().split("\\s+");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			list.add(values[i]);
		}

		int nQ = Integer.valueOf(s.nextLine());
		for (int i = 0; i < nQ; i++) {
			String q = s.nextLine();
			if (q.equals("Insert")) {
				String[] values2 = s.nextLine().split("\\s+");
				list.add(Integer.valueOf(values2[0]), values2[1]);
			} else {
				list.remove(s.nextInt());
			}
		}
		s.close();
		
		for (String i : list) {
			System.out.print(i + " ");
		}
	}
}
