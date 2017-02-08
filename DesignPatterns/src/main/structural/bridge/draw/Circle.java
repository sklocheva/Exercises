package main.structural.bridge.draw;

public class Circle extends Shape {
	private int x;
	private int y;

	public Circle(int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(x, y);
	}

}
