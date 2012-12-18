package classy;

import java.io.PrintStream;

/**
 * The abstract base class of all kinds of shapes
 */
public abstract class Shape {

	private int x;
	private int y;

	protected Shape(int x, int y) {
		moveTo(x, y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Move the shape, absolutely
	 */
	public void moveTo(int x, int y) {
		setX(x);
		setY(y);
	}

	/**
	 * Move the shape, relatively
	 */
	public void moveBy(int deltax, int deltay) {
		moveTo(getX() + deltax, getY() + deltay);
	}

	/**
	 * Draw the shape
	 */
	public abstract void draw(PrintStream s);
}
