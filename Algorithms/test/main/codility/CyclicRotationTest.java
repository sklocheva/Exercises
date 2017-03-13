package main.codility;

import org.junit.Test;

public class CyclicRotationTest {

	CyclicRotation c;
	
	@Test
	public void test() {
		c = new CyclicRotation();
		int[] arr = {1000};
		int[] arrB = c.solution2(arr, 3);
		for(int x : arrB){
			System.out.println(x);
		}
	}

}
