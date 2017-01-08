package main;

import static main.ListFixture.orderedList;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.searching.BinarySearchIterative;

public class BinarySearchIterativeTest {
	BinarySearchIterative binarySearch;

	@Before
	public void before() {
		binarySearch = new BinarySearchIterative(orderedList);
	}

	@Test
	public void searchExistingNumber() {
		assertTrue(binarySearch.binarySearch(2));
	}
	
	@Test
	public void searchNonExistentNumber() {
		assertFalse(binarySearch.binarySearch(10));
	}

}
