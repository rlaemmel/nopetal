package interfacy;

import java.io.PrintStream;

class Rectangle implements Shape {

	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void moveTo(int x, int y) {
		setX(x);
		setY(y);
	}

	public void moveBy(int deltax, int deltay) {
		setX(x + deltax);
		setY(y + deltay);
	}

	public void draw(PrintStream s) {
		s.println("Drawing a Rectangle at:(" + getX() + ", " + getY()
				+ "), width " + getWidth() + ", height " + getHeight());
	}
}
