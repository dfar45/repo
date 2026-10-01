package session10;
/**
 * Represent a Shape object
 * @author DanielHarris
 * @version 1
 */
public class Shape {

	private String name;
	private String color;
	private String id;
	public Shape () {
		name = "noName";
		color = "noColor";
		id = null;
	}
	/**
	 * Parameterize Constructor to set name
	 * and color to the past parameters and
	 * id to 0000
	 * @param name
	 * @param color
	 */
	public Shape (String name, String color) {
		this.name = name;
		this.color = color;
		id = "0000";
	}
	public Shape (Shape s) {
		name = s.name;
		color = s.color;
		id = s.id;
	}
	public void setName(String n) {
		name = n;
	}
	/**
	 * return the name of the shape
	 * @return name
	 */
	public String getName() {
		return name;
	}
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return name + " " + color + " " + id;
	}
}
