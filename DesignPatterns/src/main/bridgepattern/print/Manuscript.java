package main.bridgepattern.print;

import main.bridgepattern.print.formatter.TextFormatter;

public abstract class Manuscript {

	TextFormatter formatter;

	public Manuscript(TextFormatter formatter) {
		this.formatter = formatter;
	}
	
	public abstract void print();
}
