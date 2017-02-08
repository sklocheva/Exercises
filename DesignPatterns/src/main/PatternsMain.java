package main;

import main.structural.bridge.draw.Circle;
import main.structural.bridge.draw.DrawAPI;
import main.structural.bridge.draw.RedCircle;
import main.structural.bridge.draw.Shape;
import main.structural.bridge.print.Book;
import main.structural.bridge.print.Manuscript;
import main.structural.bridge.print.TermPaper;
import main.structural.bridge.print.formatter.FancyFormatter;
import main.structural.bridge.print.formatter.ReverseTextFormatter;
import main.structural.bridge.print.formatter.TextFormatter;

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
