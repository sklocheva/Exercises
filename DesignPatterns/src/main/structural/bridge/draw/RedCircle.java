package main.structural.bridge.draw;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int x, int y) {
		System.out.printf("Draw circle %d, %d in color RED.", x, y );
	}

}
