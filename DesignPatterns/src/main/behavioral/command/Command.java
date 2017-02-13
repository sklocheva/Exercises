package main.behavioral.command;

public interface Command {

	public String getName();

	public void setCommand(String text);

	public String executeCommand();
}
