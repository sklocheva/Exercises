package main.behavioral.command;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestCommandPattern {

	List<Command> list = AvailableCommands.getAvailableCommands();

	String arg = "UpdateOrder";
	
	@Before
	public void before() {
		// print all available commands
		System.out.println("Available commands:");
		for (Command x : list) {
			System.out.println(x.getName());

		}
		System.out.println();
	}

	@Test
	public void testUpdateOrder() {
		
		CommandParser parser = new CommandParser(list);
		Command cmd = parser.findCommand(arg);
		String s = cmd.executeCommand("some text");
		System.out.println(s);
	}

}
