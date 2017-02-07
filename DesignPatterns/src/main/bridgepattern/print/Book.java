package main.bridgepattern.print;

import main.bridgepattern.print.formatter.TextFormatter;

public class Book extends Manuscript{

	private String bookName;
	private String author;
	private String year;
	private String text;
	
	public Book(String bookName, String author, String year, String text, TextFormatter formatter) {
		super(formatter);
		this.bookName = bookName;
		this.text = text;
	}

	@Override
	public void print() {
		System.out.println(formatter.formatText("Book name: ", bookName));
		System.out.println(formatter.formatText("Author: ", author));
		System.out.println(formatter.formatText("Year of publishing: ", year));
		System.out.println(formatter.formatText("Text: ", text));
	}

}
