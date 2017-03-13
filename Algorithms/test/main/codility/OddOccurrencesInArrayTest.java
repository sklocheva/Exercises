package main.codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddOccurrencesInArrayTest {

	OddOccurrencesInArray sol;
	
	@Test
	public void test() {
		sol = new OddOccurrencesInArray();
		int[] arr = {9, 3, 9, 3, 9, 7, 9};
		assertEquals(7, sol.solutionO_N(arr));
	}

}
