package session21;

import java.util.Arrays;

import session20.Car;

public class CompareDemo2 {

	public static void main(String[] args) {
		Car c1 = new Car("Honda","Civic");
		Car c2 = new Car("BMW","X5");
		Car c3 = new Car("Hyundai","xyz");
		Car c4 = new Car("Jeep","123");
		
		System.out.println(c1.compareTo(c2));
		Car[] cars = new Car[4];
		cars[0] = c4;
		cars[1] = c3;
		cars[2] = c2;
		cars[3] = c1;
		for (Car c: cars) {
			System.out.println(c);
		}
		Arrays.sort(cars);
		System.out.println("----------------");
		for (Car c: cars) {
			System.out.println(c);
		}
	}

}
