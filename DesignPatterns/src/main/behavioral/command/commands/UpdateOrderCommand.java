package main.behavioral.command.commands;

import main.behavioral.command.AvailableCommands;
import main.behavioral.command.Command;

public class UpdateOrderCommand implements Command {

	private String name = "UpdateOrder";
	private String text;

	@Override
	public void setCommand(String text) {
		this.text = text;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String executeCommand() {
		return String.format(AvailableCommands.response, this.name, text);
	}

}
