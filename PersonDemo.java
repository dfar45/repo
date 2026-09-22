package session7;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Alex";
		p1.age = 10;
		p1.gender = "male";
		
		Person p2 = new Person();
		p2.name = "Kate";
		p2.age = 20;
		p2.gender = "Female";
		
		p1.walk();
		p2.walk();
	}

}
