package staticy;

import static staticy.Library.*;

public class Program {

	public static void main(String[] args) {

		// Construct a list of shapes
		Shape[] scribble = new Shape[2];
		Rectangle r = new Rectangle();
		setX(r, 10);
		setY(r, 20);
		setWidth(r, 5);
		setHeight(r, 6);
		scribble[0] = r;
		Circle c = new Circle();
		setX(c, 15);
		setY(c, 25);
		setRadius(c, 8);
		scribble[1] = c;

		// Handle the shapes in the list polymorphically
		for (int i = 0; i < scribble.length; i++) {
			draw(scribble[i], System.out);
			moveBy(scribble[i], 100, 100);
			draw(scribble[i], System.out);
		}

		// Test the effect of the moves
		assert getX(scribble[0]) == 110;
		assert getX(scribble[1]) == 115;
	}
}
