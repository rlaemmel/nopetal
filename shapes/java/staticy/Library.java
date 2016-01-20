package staticy;

import java.io.PrintStream;

public class Library {
	
	public static int getX(Shape s) {
		return s.x;
	}

	public static int getY(Shape s) {
		return s.y;
	}

	public static void setX(Shape s, int x) {
		s.x = x;
	}

	public static void setY(Shape s, int y) {
		s.y = y;
	}

	/**
	 * Move the shape, absolutely
	 */
	public static void moveTo(Shape s, int x, int y) {
		setX(s, x);
		setY(s, y);
	}

	/**
	 * Move the shape, relatively
	 */
	public static void moveBy(Shape s, int deltax, int deltay) {
		moveTo(s, getX(s) + deltax, getY(s) + deltay);
	}

	public static void draw(Shape s, PrintStream ps) {
		if (s instanceof Circle)
			draw((Circle)s, ps);
		else if (s instanceof Rectangle)
			draw((Rectangle)s, ps);
		else
			throw new ClassCastException();
	}
		
	public static int getRadius(Circle c) {
		return c.radius;
	}

	public static void setRadius(Circle c, int radius) {
		c.radius = radius;
	}

	public static void draw(Circle c, PrintStream ps) {
		ps.println("Drawing a Circle at:(" + getX(c) + ", " + getY(c)
				+ "), radius " + getRadius(c));
	}
	
	public static int getWidth(Rectangle r) {
		return r.width;
	}

	public static int getHeight(Rectangle r) {
		return r.height;
	}

	public static void setWidth(Rectangle r, int width) {
		r.width = width;
	}

	public static void setHeight(Rectangle r, int height) {
		r.height = height;
	}

	public static void draw(Rectangle r, PrintStream ps) {
		ps.println("Drawing a Rectangle at:(" + getX(r) + ", " + getY(r)
				+ "), width " + getWidth(r) + ", height " + getHeight(r));
	}

}
