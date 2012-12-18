package classy.withSquares.sub;

import java.io.PrintStream;

class Square extends Rectangle {
	
	public Square(int x, int y, int length) {
		super(x, y, length, length);
	}

	public int getLength() {
		return getWidth();
	}

	public void setLength(int length) {
		setWidth(length);
		setHeight(length);
	}

	public void draw(PrintStream s) {
		s.println("Drawing a Square at:(" + getX() + ", " + getY()
				+ "), length " + getLength());
	}
}
