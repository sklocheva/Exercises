package main.recursion;

import static main.ListFixture.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinearSumTest {

	LinearSum linearSum;

	@Before
	public void before() {
		linearSum = new LinearSum();
	}

	//list is statically imported
	@Test
	public void testSumFirstTwoNumbers() {

		Assert.assertEquals(11, linearSum.sum(list, 2));
	}

	@Test
	public void testSumAllNumbers() {

		Assert.assertEquals(33, linearSum.sum(list, 7));
	}

}
