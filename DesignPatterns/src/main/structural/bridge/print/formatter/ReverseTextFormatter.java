package main.structural.bridge.print.formatter;

public class ReverseTextFormatter implements TextFormatter {

	@Override
	public String formatText(String key, String value) {

		return new StringBuilder(String.format("%s: %s", key, value)).reverse().toString();
	}

}
