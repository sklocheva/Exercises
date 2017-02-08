package main.structural.bridge.print;

import main.structural.bridge.print.formatter.TextFormatter;

public abstract class Manuscript {

	TextFormatter formatter;

	public Manuscript(TextFormatter formatter) {
		this.formatter = formatter;
	}
	
	public abstract void print();
}
