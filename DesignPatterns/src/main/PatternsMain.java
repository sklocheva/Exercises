package main;

import main.bridgepattern.draw.Circle;
import main.bridgepattern.draw.DrawAPI;
import main.bridgepattern.draw.RedCircle;
import main.bridgepattern.draw.Shape;
import main.bridgepattern.print.Book;
import main.bridgepattern.print.Manuscript;
import main.bridgepattern.print.TermPaper;
import main.bridgepattern.print.formatter.FancyFormatter;
import main.bridgepattern.print.formatter.ReverseTextFormatter;
import main.bridgepattern.print.formatter.TextFormatter;

public class PatternsMain {

	public static void main(String[] args) {

		DrawAPI red = new RedCircle();
		Shape circle1 = new Circle(3, 3, red);
		circle1.draw();
		System.out.println();
		
		TextFormatter formatter = new FancyFormatter();
		TextFormatter formatter2 = new ReverseTextFormatter();
		Manuscript book = new Book("mybook", "author", "1999", "Texttexttext", formatter);
		Manuscript paper = new TermPaper("Bill", "title", "text", formatter2);
		book.print();
		paper.print();
	}

}
