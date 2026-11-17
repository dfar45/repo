package session20;

import session19.Rectangle;

public class InterfaceDemo1 {

	public static void main(String[] args) {
		Car c1 = new Car("Honda", "Civic");
		
		Movable[] shapes = new Movable[3];
		shapes[0] = new Rectangle("Box", "B", 4, 5);
		shapes[1] = c1;
		for (Movable d : shapes) {
			if (d != null) {
				System.out.println(d);
				d.rotate(10);
				d.moveUp(3);
			}
		}

	}

}
