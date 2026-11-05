package session18;

public class Circle extends Shape {
	private double radius;
	public Circle(String name, String color, double radius) {
		super(name, color);
		this.radius = radius;
	}
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	@Override
	public String toString() {
		return super.toString()+" "+this.radius;
	}
}
