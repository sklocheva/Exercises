package main.sort;

import static main.ListFixture.list;
import static main.ListFixture.orderedList;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void test() {
		System.out.println(list);
		InsertionSort sort = new InsertionSort(list);
		sort.sort();
		System.out.println(list);
		assertEquals(orderedList, list);
	}


}
