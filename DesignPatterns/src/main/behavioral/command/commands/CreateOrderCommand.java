package main.behavioral.command.commands;

import main.behavioral.command.AvailableCommands;
import main.behavioral.command.Command;

public class CreateOrderCommand implements Command {

	private String name = "CreateOrder";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String executeCommand(String arg) {
		return String.format(AvailableCommands.response, this.name, arg);
	}

}
