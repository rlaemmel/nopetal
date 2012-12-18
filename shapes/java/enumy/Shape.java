package enumy;

import java.io.PrintStream;

class Shape {

	private int x;
	private int y;
	private int radius;
	private int width;
	private int height;
	private KindOfShape kind;

	/**
	 * Construction fixes the kind. Setters need to be invoked subsequently,
	 */
	public Shape(KindOfShape kind) {
		this.kind = kind;
	}

	/**
	 * Static convenience method for constructing a circle
	 */
	public static Shape makeCircle(int x, int y, int radius) {
		Shape circle = new Shape(KindOfShape.Circle);
		circle.setX(x);
		circle.setY(y);
		circle.setRadius(radius);
		return circle;
	}

	/**
	 * Static convenience method for constructing a rectangle
	 */
	public static Shape makeRectangle(int x, int y, int width, int height) {
		Shape rectangle = new Shape(KindOfShape.Rectangle);
		rectangle.setX(x);
		rectangle.setY(y);
		rectangle.setWidth(width);
		rectangle.setHeight(height);
		return rectangle;
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

	public void setRadius(int radius) {
		this.radius = radius;
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
		switch (kind) {
		case Circle:
			s.println("Drawing a Circle at:(" + getX() + ", " + getY()
					+ "), radius " + getRadius());
			break;
		case Rectangle:
			s.println("Drawing a Rectangle at:(" + getX() + ", " + getY()
					+ "), width " + getWidth() + ", height " + getHeight());
			break;
		}
	}
}
