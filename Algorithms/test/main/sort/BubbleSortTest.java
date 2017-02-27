package main.sort;

import static main.ListFixture.arr;
import static main.ListFixture.orderedArr;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
	BubbleSort sort = new BubbleSort(arr);

	@Test
	public void test() {
		sort.sort();
		Assert.assertArrayEquals(orderedArr, arr);
	}

}
