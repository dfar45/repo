package session21;

import session20.Car;

public class CompareDemo1 {

	public static void main(String[] args) {
		String n1 = "HI", n2 = "Hi";
		System.out.println(n1.compareTo(n2));
		int x = 9, y = 7;
		if(x > y) {
			
		}
		Car c1 = new Car("Honda","Civic");
		Car c2 = new Car("BMW","X5");
		
		if (c1.compareTo(c2) == 0) {
			
		} else if(c1.compareTo(c2) > 0) {
			
		}
	}

}
