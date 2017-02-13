package main.behavioral.command;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestCommandPattern {

	List<Command> availableCmd = AvailableCommands.getAvailableCommands();
	static List<String> listOfInput;
	static String arg1 = "UpdateOrder";
	static String arg2 = "ShipOrder";
	static String arg3 = "Order";
	
	@Before
	public void before() {
		
		listOfInput = new ArrayList<String>();
		listOfInput.add(arg1);
		listOfInput.add(arg2);
		listOfInput.add(arg3);
		
		// print all available commands
		System.out.println("Available commands:");
		for (Command x : availableCmd) {
			System.out.println(x.getName());

		}
		System.out.println();
	}

	@Test
	public void testUpdateOrder() {
		
		
	}
	
	
}
