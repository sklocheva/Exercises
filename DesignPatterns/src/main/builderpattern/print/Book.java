package main.builderpattern.print;

public class Book extends Manuscript{

	private String bookName;
	private String text;
	
	public Book(String bookName, String text, TextFormatter formatter) {
		super(formatter);
		this.bookName = bookName;
		this.text = text;
	}

	@Override
	public void print() {
		System.out.println(formatter.formatText(bookName, text));
	}

}
