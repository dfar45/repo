package session7;

public class Person {
	//Attributes ( Fields, instance variables)
	private String name;
	private int age;
	private String gender;
	
	public Person () {
		name = "No Name";
		age = 0;
		gender = "Unknown";
	}
	public Person(String n, int a) {
		name = n;
		age = a;
		gender = "unknown";
	}
	public Person (String n, int a, String g) {
		name = n;
		age = a;
		gender = g;
	}
	public void setName(String n)
	{
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setAge (int age) {
		this.age = age;
	}
	// Methods
	public void walk() {
		System.out.println(name+" walks!");
	}
	/**
	 * implement this method to display
	 * the information of the person as follows:
	 * name is age years old and is gender
	 */
	public String displayInfo() {
		return (name+" is "+age+" years old and is "+gender);
	}
}
