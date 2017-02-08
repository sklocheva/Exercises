package main.behavioral.chainofresposibility.logger;

public class ErrorLogger extends AbstractHandler {

	public ErrorLogger(LogLevel level){
		super(level);
	}
	
	@Override
	protected String write(String message) {
		return String.format("Error Console:: Logger: %s", message);
	}

}
