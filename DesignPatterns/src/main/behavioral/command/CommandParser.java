package main.behavioral.command;

import java.util.List;

public class CommandParser {

	List<Command> availableCmd;

	CommandParser(List<Command> availableCmd) {
		this.availableCmd = availableCmd;
	}

	public Command findCommand(String command) {
		
		for (Command x : availableCmd) {
			if (command.equals(x.getName())) {
				return x;
			}
		}
		return new NotFoundCommand(command);
	}

}
