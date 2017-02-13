package main.behavioral.command.commands;

import main.behavioral.command.Command;

public class NotFoundCommand implements Command {

	String name = "Command not found: %s with arg %s";
	String commandNotFound;

	public NotFoundCommand(String command) {
		commandNotFound = command;
	}

	// not used
	@Override
	public void setCommand(String text) {
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String executeCommand() {
		return String.format(name, commandNotFound);
	}

}
