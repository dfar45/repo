package session18;

public class Shape {
	private String name;
	private String color;
	
	public Shape() {
		this("NoName", "NoColor");
	}
	public Shape(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Shape))
			return false;
		Shape s = (Shape) o;
		return name.equals(s.name) && color.equals(s.color);
	}
	@Override
	public String toString() {
		return this.name+" "+this.color;
	}
}
