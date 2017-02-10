package main.hackerrank.algorithms;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class ClosestNumberTest {

	int n;
	int[] a;
	@Before
	public void before() {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
		}
	}

	
	@Test
	public void testArray() {
		long timeStart = System.nanoTime();
		ClosestNumber.solutionArrayList(n, a);
		System.out.println("Array" + (System.nanoTime()-timeStart));
	}

	@Test
	public void testLinkedList() {
		long timeStart = System.nanoTime();
		ClosestNumber.solutionLinkedList(n, a);
		System.out.println("LinkedList" + (System.nanoTime()-timeStart));
	}
	
	@Test
	public void testStringBuilder() {
		long timeStart = System.nanoTime();
		ClosestNumber.solutionStringBuilder(n, a);
		System.out.println("String" + (System.nanoTime()-timeStart));
	}
}
