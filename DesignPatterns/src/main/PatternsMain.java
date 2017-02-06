package main;

import main.builderpattern.draw.Circle;
import main.builderpattern.draw.DrawAPI;
import main.builderpattern.draw.RedCircle;
import main.builderpattern.draw.Shape;
import main.builderpattern.print.Book;
import main.builderpattern.print.Manuscript;
import main.builderpattern.print.TextFormatter;
import main.builderpattern.print.formatter.FancyFormatter;

public class PatternsMain {

	public static void main(String[] args) {

		DrawAPI red = new RedCircle();
		Shape circle1 = new Circle(3, 3, red);
		circle1.draw();
		System.out.println();
		
		TextFormatter formatter = new FancyFormatter();
		Manuscript book = new Book("mybook", "textexttext", formatter);
		book.print();
	}

}
