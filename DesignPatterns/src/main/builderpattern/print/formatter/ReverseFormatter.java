package main.builderpattern.print.formatter;

import main.builderpattern.print.TextFormatter;

public class ReverseFormatter implements TextFormatter {

	@Override
	public String formatText(String key, String value) {
		String reverseKey = new StringBuilder(key).reverse().toString();
		String reverseValue = new StringBuilder(value).reverse().toString();
		return String.format("%s: %s.", reverseKey, reverseValue);
	}

}
