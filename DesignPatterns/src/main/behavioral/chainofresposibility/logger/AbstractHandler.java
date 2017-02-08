package main.behavioral.chainofresposibility.logger;

public abstract class AbstractHandler {

	private LogLevel level;
	private AbstractHandler next;
	
	public AbstractHandler(LogLevel level){
		this.level = level;
	}

	public void setNextLogger(AbstractHandler nextLogger) {
		this.next = nextLogger;
	}

	public String handleMessage(LogLevel level, String message) {
		if (this.level.equals(level)) {
			return write(message);
		} else {
			return next.handleMessage(level, message);
		}
	}

	protected abstract String write(String message);
}
