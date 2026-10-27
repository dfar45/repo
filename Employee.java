package session15;

public class Employee {

	private int empId;
	private String name;
	private double salary;
	private static double percentage = 0.03;
	
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public void increasePercentage() {
		percentage += 0.01;
	}
	public int getId() {
		return empId;
	}
	public double getPer() {
		return percentage;
	}
	
	public String toString() {
		return this.empId+" "+this.name+" "+this.salary+" "+percentage;
	}
}
