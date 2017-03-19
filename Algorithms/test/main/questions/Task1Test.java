package main.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task1Test {

	Task1 task;
	
	@Test
	public void test() {
		task = new Task1();
		System.out.println(task.solution("00-44  48 5555 8361"));
		System.out.println(task.solution("0 - 22 1985--324"));
		System.out.println(task.solution("555372654"));
		
	}

}
