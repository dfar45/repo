package session19;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3, 7);
		Rectangle r2 = new Rectangle("Box", "Yellow", 3, 7);
		Rectangle r3 = new Rectangle("Box", "Yellow", 3, 7);
		System.out.println(r2);
		System.out.print(r2.getArea()+" "+r2.equals(r1)+" "+r2.equals(r3));
	}
}
