package main.sort;

import static main.ListFixture.arr;
import static main.ListFixture.orderedArr;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

	QuickSort quick = new QuickSort(arr);
	
	@Test
	public void test() {
		quick.sort();
		Assert.assertArrayEquals(orderedArr, arr);
	}

}
