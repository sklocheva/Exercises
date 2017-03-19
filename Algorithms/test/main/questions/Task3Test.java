package main.questions;

import org.junit.Before;
import org.junit.Test;

public class Task3Test {

	Task3 task;

	@Before
	public void before() {
		task = new Task3();
	}

	@Test
	public void test2013() {
		System.out.println(task.solution(2013, "June", "July", "Tuesday"));
	}

	@Test
	public void test2017() {
		System.out.println(task.solution(2017, "June", "July", "Sunday"));
	}

	@Test
	public void test2013longer() {
		System.out.println(task.solution(2013, "June", "September", "Tuesday"));
	}

	@Test
	public void test2014Leaplonger() {
		System.out.println(task.solution(2014, "June", "September", "Wednesday"));
	}

	@Test
	public void test2016longer() {
		System.out.println(task.solution(2016, "June", "September", "Friday"));
	}

}
