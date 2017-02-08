package main.behavioral.chainofresposibility.expensehandler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This class is used to illustrate the Chain of responsibility pattern example
 * Expense handler.
 * 
 * @author Sophie
 *
 */
public class TestExpenseHandler {

	Employee hana;
	Employee rob;
	Employee john;
	Employee peter;

	String response;
	String expected = "Expense approved by %s.";
	String denied = "Your request for %s has been denied.";

	@Before
	public void brefore() {
		hana = new Employee("Hana", 100d);
		rob = new Employee("Robert", 500d);
		john = new Employee("John", 1000d);
		peter = new Employee("Peter", 1500d);

		hana.setManager(rob);
		rob.setManager(john);
		john.setManager(peter);
	}

	@Test
	public void testHandledByJohn() {
		response = hana.handleRequest(800d);
		assertEquals(String.format(expected, "John"), response);
	}

	@Test
	public void testHandledByPeter() {
		response = hana.handleRequest(1200d);
		assertEquals(String.format(expected, "Peter"), response);
	}

	@Test
	public void testDenied() {
		response = hana.handleRequest(3000d);
		assertEquals(String.format(denied, 3000d), response);
	}

}
