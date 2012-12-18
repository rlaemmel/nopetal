package interfacy;

import java.io.PrintStream;

class Circle implements Shape {

	private int x;
	private int y;
	private int radius;

	public Circle(int x, int y, int radius) {
		setX(x);
		setY(y);
		setRadius(radius);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getRadius() {
		return radius;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
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
		s.println("Drawing a Circle at:(" + getX() + ", " + getY()
				+ "), radius " + getRadius());
	}
}
