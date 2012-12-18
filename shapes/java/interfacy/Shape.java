package interfacy;

import java.io.PrintStream;

/**
 * The interface for all kinds of shapes
 */
public interface Shape {

	public int getX();

	public int getY();

	public void setX(int x);

	public void setY(int y);

	/**
	 * Move the shape, absolutely
	 */
	public void moveTo(int x, int y);

	/**
	 * Move the shape, relatively
	 */
	public void moveBy(int deltax, int deltay);

	/**
	 * Draw the shape
	 */
	public void draw(PrintStream s);
}
