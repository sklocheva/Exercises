package main.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

import main.other.recusrion.FactorialFunction;

public class FactorialFunctionTest {

	FactorialFunction factorial = new FactorialFunction();

	@Test
	public void testFactorialRecursion() {
		
		assertEquals(120, factorial.factorial(5));
	}
	
	@Test
	public void testFactorialLoop() {
		
		assertEquals(120, factorial.factorialLoop(5));
	}

}
