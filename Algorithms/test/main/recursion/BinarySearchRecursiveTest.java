package main.recursion;

import static main.ListFixture.orderedList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinarySearchRecursiveTest {

	BinarySearchRecursive binarySearch = new BinarySearchRecursive(orderedList);
	

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

}
