package main.sort;

import static main.ListFixture.arr;
import static main.ListFixture.orderedArr;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

	MergeSort merge = new MergeSort();

	@Test
	public void test() {
		merge.sort(arr);
		Assert.assertArrayEquals(orderedArr, arr);
	}

}
