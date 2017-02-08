package main.behavioral.command;

public class NotFoundCommand implements Command {

	String name = "Command not found: %s";
	String commandNotFound;
	
	NotFoundCommand(String command){
		this.commandNotFound = command;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String executeCommand(String arg) {
		return String.format(name, commandNotFound);
	}

}
