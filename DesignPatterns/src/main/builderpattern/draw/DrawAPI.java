package main.builderpattern.draw;

/**
 * DrawAPI interface is acting as a bridge implementer and concrete classes
 * RedCircle, GreenCircle implementing the DrawAPI interface.
 * 
 * @author Sophie
 *
 */
public interface DrawAPI {

	public void drawCircle(int x, int y);
}
