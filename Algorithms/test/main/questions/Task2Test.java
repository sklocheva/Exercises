package main.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task2Test {
	Task2 task;

	@Test
	public void test() {
		task = new Task2();
		int[] A = { 4, 5, 5, 3, 2 };
		int[] B = { 1, 3, 2, 1 };
		System.out.println(task.solution(A, B));
	}

	
	@Test
	public void test2() {
		task = new Task2();

		int[] A = { 1, 3, 2, 1 };
		int[] B = { 4, 5, 5, 3, 2 };
		System.out.println(task.solution(A, B));
	}
	
	@Test
	public void test3() {
		task = new Task2();
		int[] B = { 4, 5, 5, 3 };
		int[] A = { 1, 3, 2, 1 };
		System.out.println(task.solution(A, B));
	}
}
