package session8;

import session7.Person;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Alex");
		p1.walk();
		System.out.println(p1.displayInfo());
		
		Person p2 = new Person("Kate", 45);
		p2.displayInfo();
		
		Person p3 = new Person("Jake", 13, "Male");
		p3.displayInfo();
		p3.getName();
		System.out.println(p3.getName());
		System.out.println(p1+" "+p2+" "+p3);
	}

}
