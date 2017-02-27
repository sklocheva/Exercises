package main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFixture {


	public static List<Integer> list = new ArrayList<Integer>();
	public static List<Integer> orderedList;
	public static int[] arr = new int[7];
	public static int[] orderedArr;
	
	static{
		list.add(5);
		arr[0] = 5;
		list.add(6);
		arr[1] = 6;
		list.add(7);
		arr[2] = 7;
		list.add(1);
		arr[3] = 1;
		list.add(2);
		arr[4] = 2;
		list.add(9);
		arr[5] = 9;
		list.add(3);
		arr[6] = 3;
		orderedList = new ArrayList<Integer>(list);
		Collections.sort(orderedList);
		
		orderedArr = arr.clone();
		Arrays.sort(orderedArr);
	}
}
