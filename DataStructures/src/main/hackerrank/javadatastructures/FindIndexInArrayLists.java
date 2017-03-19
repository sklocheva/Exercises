package main.hackerrank.javadatastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 *  
 * Java ArrayList:
 * 
 * Sample Input

	5
	5 41 77 74 22 44
	1 12
	4 37 34 36 52
	0
	3 20 22 33
	5
	1 3
	3 4
	3 1
	4 3
	5 5
	
	In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"
	Sample Output

	74
	52
	37
	ERROR!
	ERROR!
	
 * @author Sophie
 *
 */
public class FindIndexInArrayLists {

	public void findIndex() {
		//reading
		Scanner s = new Scanner(System.in);
		int numberLists = Integer.valueOf(s.nextLine());
		List<List<String>> numberList = new ArrayList<List<String>>();

		for (int i = 0; i < numberLists; i++) {
			String[] values = s.nextLine().split("\\s+");
			numberList.add(Arrays.asList(values));
		}

		int numberQueries = Integer.valueOf(s.nextLine());
		List<List<String>> queryList = new ArrayList<List<String>>();
		for (int i = 0; i < numberQueries; i++) {
			String[] values = s.nextLine().split("\\s+");
			queryList.add(Arrays.asList(values));
		}
		s.close();

		//getting the queried number
		for (int i = 0; i < numberQueries; i++) {
			int listNumber = (Integer.valueOf(queryList.get(i).get(0))) - 1;
			int position = (Integer.valueOf(queryList.get(i).get(1)));

			if (numberList.size() > listNumber) {
				if (numberList.get(listNumber).size() > position) {
					System.out.println(numberList.get(listNumber).get(position));
				} else {
					System.out.println("ERROR!");
				}
			} else {

				System.out.println("ERROR!");
			}

		}
	}
}
