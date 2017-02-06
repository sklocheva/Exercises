package main.builderpattern.print;

public class TermPaper extends Manuscript{

	private String studentName;
	private String text;
	
	public TermPaper(String studentName, String text, TextFormatter formatter) {
		super(formatter);
		this.studentName = studentName;
		this.text = text;
	}

	@Override
	public void print() {
		System.out.println(formatter.formatText(studentName, text));
	}

}
