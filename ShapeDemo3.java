package session19;

import session18.Circle;
import session18.Shape;

public class ShapeDemo3 {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle("round", "yellow", 5);
		shapes[1] = new Circle("loop", "blue", 3);
		shapes[2] = new Rectangle("Box", "white", 5, 7);
		shapes[3] = new Rectangle("Desk", "purple", 4, 7);
		for (Shape a: shapes) {
			System.out.println(a+" "+a.getArea());
			
		}

	}

}
