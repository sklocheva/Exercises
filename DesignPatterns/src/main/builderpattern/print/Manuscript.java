package main.builderpattern.print;

public abstract class Manuscript {

	TextFormatter formatter;

	public Manuscript(TextFormatter formatter) {
		this.formatter = formatter;
	}
	
	public abstract void print();
}
