package main.behavioral.command;

import java.util.ArrayList;
import java.util.List;

import main.behavioral.command.commands.NotFoundCommand;

public class CommandExecuter {

	List<Command> availableCmd;
	List<Command> storedCmd;

	CommandExecuter(List<Command> availableCmd) {
		this.availableCmd = availableCmd;
		storedCmd = new ArrayList<Command>();
	}

	// loop through all available commands to find it and them store in a list
	// of commands
	public void storeCommand(String command, String text) {
		for (Command x : availableCmd) {
			if (command.equals(x.getName())) {
				x.setCommand(text);
				storedCmd.add(x);
			} else {
				storedCmd.add(new NotFoundCommand(command));
			}
		}
	}

	public void executeCommands() {
		for(Command x : storedCmd){
			System.out.println(x.executeCommand());
		}
	}

}
