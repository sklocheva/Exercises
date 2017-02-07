package main.bridgepattern.print;

import main.bridgepattern.print.formatter.TextFormatter;

public class TermPaper extends Manuscript{

	private String studentName;
	private String paperTitle;
	private String text;
	
	public TermPaper(String studentName, String paperTitle, String text, TextFormatter formatter) {
		super(formatter);
		this.studentName = studentName;
		this.paperTitle = paperTitle;
		this.text = text;
	}

	@Override
	public void print() {
		System.out.println(formatter.formatText("Student: ", studentName));
		System.out.println(formatter.formatText("Term paper title: ", paperTitle));
		System.out.println(formatter.formatText("Text: ", text));
	}

}
