package main.recursion;

import static main.ListFixture.orderedArr;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.other.recusrion.BinarySearchRecursive;

public class BinarySearchRecursiveTest {

	BinarySearchRecursive binarySearch;

	@Before
	public void before() {
		binarySearch = new BinarySearchRecursive(orderedArr);
	}

	@Test
	public void testReturnFalse() {
		assertFalse(binarySearch.binarySearch(12));
	}

	@Test
	public void testFirstElement() {
		assertTrue(binarySearch.binarySearch(5));
	}

	@Test
	public void testLastElement() {
		assertTrue(binarySearch.binarySearch(3));
	}

	@Test
	public void testSomeElement() {
		assertTrue(binarySearch.binarySearch(2));
	}

}
