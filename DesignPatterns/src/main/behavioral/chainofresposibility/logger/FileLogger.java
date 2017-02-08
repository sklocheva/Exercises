package main.behavioral.chainofresposibility.logger;

public class FileLogger extends AbstractHandler {

	public FileLogger(LogLevel level) {
		super(level);
	}

	@Override
	protected String write(String message) {
		return String.format("File Console:: Logger: %s", message);
	}

}
