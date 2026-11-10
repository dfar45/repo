package session19;

import session18.Shape;

public class Rectangle extends Shape {

	private double length;
	private double width;
	public Rectangle (double l, double w) {
		super();
		length = l;
		width = w;
	}
	public Rectangle (String name, String color, double l, double w) {
		super.setName(name);
		super.setColor(color);
		length = l;
		width = w;
	}
	public double getArea() {
		return length * width;
	}
	
	@Override
	public boolean equals(Object r) {
		if(!(r instanceof Rectangle)) {
			return false;
		}
		Rectangle temp = (Rectangle) r;
		return super.equals(temp) && this.length == temp.length && this.width == width;
	}
	public String toString() {
		return super.toString()+" "+length+" "+width;
	}
}
