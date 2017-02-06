package main.builderpattern.print.formatter;

import main.builderpattern.print.TextFormatter;

public class FancyFormatter implements TextFormatter {

	@Override
	public String formatText(String key, String value) {
		return String.format("----%s===%s.", key, value);
	}

}
