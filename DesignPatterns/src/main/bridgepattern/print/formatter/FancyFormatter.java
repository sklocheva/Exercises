package main.bridgepattern.print.formatter;

public class FancyFormatter implements TextFormatter {

	@Override
	public String formatText(String key, String value) {
		return String.format("-----!!! %s-----||-----%s", key, value);
	}

}
