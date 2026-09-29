package session8;

import session7.Person;

public class MethodsWithClassParameters {

	public static void setPersonAge(Person p, int age) {
		p.setAge(age);
	}
	public static Person createPerson() {
		String name;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name and age: ");
		name = input.next();
		age = input.nextInt();
		Person p = new Person(name, age);
		return p;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Kate", 14);
		setPersonAge(p1, 70);
		System.out.println(p1.displayInfo());
	}
}
