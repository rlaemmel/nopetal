package classy.withSquares.sibling;

import java.io.PrintStream;

class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		setWidth(width);
		setHeight(height);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw(PrintStream s) {
		s.println("Drawing a Rectangle at:(" + getX() + ", " + getY()
				+ "), width " + getWidth() + ", height " + getHeight());
	}
}
