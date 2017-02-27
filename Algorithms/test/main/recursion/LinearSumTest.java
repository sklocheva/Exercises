package main.recursion;

import static main.ListFixture.arr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.other.recusrion.LinearSum;

public class LinearSumTest {

	LinearSum linearSum;

	@Before
	public void before() {
		linearSum = new LinearSum();
	}

	//list is statically imported
	@Test
	public void testSumFirstTwoNumbers() {

		Assert.assertEquals(11, linearSum.sum(arr, 2));
	}

	@Test
	public void testSumAllNumbers() {

		Assert.assertEquals(33, linearSum.sum(arr, 7));
	}

}
