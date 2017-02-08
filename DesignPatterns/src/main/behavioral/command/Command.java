package main.behavioral.command;

public interface Command {

	public String getName();
	public String executeCommand(String arg);
}
