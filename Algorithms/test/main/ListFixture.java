package main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFixture {


	public static List<Integer> list = new ArrayList<Integer>();
	public static List<Integer> orderedList;
	
	static{
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(1);
		list.add(2);
		list.add(9);
		list.add(3);
		orderedList = list;
		Collections.sort(orderedList);
	}
}
