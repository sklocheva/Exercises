package main.structural.bridge.print;

import org.junit.Before;
import org.junit.Test;

import main.structural.bridge.print.Book;
import main.structural.bridge.print.Manuscript;
import main.structural.bridge.print.TermPaper;
import main.structural.bridge.print.formatter.FancyFormatter;
import main.structural.bridge.print.formatter.ReverseTextFormatter;
import main.structural.bridge.print.formatter.TextFormatter;

/**
 * This class is used to illustrate the print example of the Bridge Pattern.
 * 
 * The formatter is decoupled from the manuscript in order for it to be able
 * change to change independently.
 * 
 * @author Sophie
 *
 */
public class TestBridgePatternPrint {

	TextFormatter fancyFormatter;
	TextFormatter reverseFormatter;
	Manuscript book;
	Manuscript termPaper;

	@Before
	public void before() {

		fancyFormatter = new FancyFormatter();
		reverseFormatter = new ReverseTextFormatter();
	}

	@Test
	public void testFancyFormatterOnBook() {
		book = new Book("mybook", "author", "1999", "Texttexttext", fancyFormatter);
		book.print();
	}

	@Test
	public void testReverseFormatterOnTermPaper() {
		termPaper = new TermPaper("Bill", "title", "text", reverseFormatter);
		termPaper.print();
	}
}
