package session15;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(11, "Bob", 1000);
		Employee e2 = new Employee(22, "Kate", 2000);
		System.out.println(e1);
		e1.increasePercentage();
		System.out.println(e2);
	}
}
