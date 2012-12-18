package classy.withSquares.sub;

import java.io.PrintStream;

class Circle extends Shape {

	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		setRadius(radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw(PrintStream s) {
		s.println("Drawing a Circle at:(" + getX() + ", " + getY()
				+ "), radius " + getRadius());
	}
}
