package main.sort;

import static main.ListFixture.arr;
import static main.ListFixture.orderedArr;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

	
	@Test
	public void test() {
		SelectionSort sort = new SelectionSort(arr);

		sort.sort();
		Assert.assertArrayEquals(orderedArr, arr);
	}

}
