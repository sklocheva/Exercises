package main.behavioral.chainofresposibility.logger;

public class InfoLogger extends AbstractHandler {

	public InfoLogger(LogLevel level) {
		super(level);
	}

	@Override
	protected String write(String message) {
		return String.format("Info Console:: Logger: %s", message);
	}

}
