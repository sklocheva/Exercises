package main.sort;

import static org.junit.Assert.*;
import static main.ListFixture.*;
import org.junit.Test;

public class SelectionSortTest {

	
	@Test
	public void test() {
		SelectionSort sort = new SelectionSort(list);

		System.out.println(list.toString());
		sort.sort();
		System.out.println(list.toString());

		assertEquals(orderedList, list);
	}

}
