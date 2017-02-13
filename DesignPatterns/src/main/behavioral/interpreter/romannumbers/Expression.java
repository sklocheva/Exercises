package main.behavioral.interpreter.romannumbers;

public abstract class Expression {

	public void interpret(Context context) {

		if (context.getInput().length() == 0) {
			return;
		}
		// tries to find the appropriate roman symbol, when it finds it adds the
		// corresponding arabic number * by its multiplier, adds it to the output
		// and removes the roman number from the input
		if (context.getInput().startsWith(nine())) {
			context.setOutput(context.getOutput() + (9 * multiplier()));
			context.setInput(context.getInput().substring(2));
		} else if (context.getInput().startsWith(four())) {
			context.setOutput(context.getOutput() + (4 * multiplier()));
			context.setInput(context.getInput().substring(2));
		} else if (context.getInput().startsWith(five())) {
			context.setOutput(context.getOutput() + (5 * multiplier()));
			context.setInput(context.getInput().substring(1));
		}

		while (context.getInput().startsWith(one())) {
			context.setOutput(context.getOutput() + (1 * multiplier()));
			context.setInput(context.getInput().substring(1));
		}
	}

	public abstract String one();

	public abstract String four();

	public abstract String five();

	public abstract String nine();

	public abstract int multiplier();
}
