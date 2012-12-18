package classy.withSquares.sup;

import java.io.PrintStream;

class Rectangle extends Square {

	// private int width; // super.length is width
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y, width);
		setHeight(height);
	}

	public int getWidth() {
		return getLength();
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		setLength(width);
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw(PrintStream s) {
		s.println("Drawing a Rectangle at:(" + getX() + ", " + getY()
				+ "), width " + getWidth() + ", height " + getHeight());
	}
}
