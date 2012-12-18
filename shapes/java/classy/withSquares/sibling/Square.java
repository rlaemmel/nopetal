package classy.withSquares.sibling;

import java.io.PrintStream;

class Square extends Shape {

	private int length;
	
	public Square(int x, int y, int length) {
		super(x, y);
		setLength(length);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void draw(PrintStream s) {
		s.println("Drawing a Square at:(" + getX() + ", " + getY()
				+ "), length " + getLength());
	}
}
