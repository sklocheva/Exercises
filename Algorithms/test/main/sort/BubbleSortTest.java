package main.sort;

import static main.ListFixture.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {
	BubbleSort sort = new BubbleSort(list);

	@Test
	public void test() {
		sort.sort();
		assertEquals(orderedList, list);
	}

}
