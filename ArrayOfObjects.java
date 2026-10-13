package session12;

import session10.Shape;

public class ArrayOfObjects {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Shape ("circle", "red");
		shapes[1] = new Shape ("rectangle", "blue");
		shapes[2] = new Shape ("triangle", "purple");
		for (Shape s : shapes) {
			System.out.println(s);
		}
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		Shape[] refShapes = shapes;
		//How many arrays? 1
		Shape[] shallowShapes = new Shape[shapes.length];
		for (int i = 0; i < shapes.length; i++) {
			shallowShapes[i] = shapes[i];
		}
		shapes[0].setColor("yellow");
		System.out.print(shallowShapes[0]);
		Shape[] deepShapes = new Shape[shapes.length];
		for (int i = 0; i < shapes.length; i++) {
			deepShapes[i] = new Shape(shapes[i]);
		}
	}
}
