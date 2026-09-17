package session6;

import java.util.Scanner;

public class MethodDemo1 {
	public static String firstLastInitial() {
		String name, lastName;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name:");
		name = input.next();
		System.out.println("What is your last name:");
		lastName = input.next();
		return ""+name.charAt(0) + lastName.charAt(0);
		}
	public static boolean isPositive(int num) {
		
		if (num > 0) {
			return true;
		} else {
			return false;
		}
	}
	public int count(); {
		Scanner display = new Scanner(System.in);
		int sum = 0, max;
		max = display.nextInt();
		for (int i = 1; i < max; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		String result = firstLastInitial();
		System.out.print(result);
		System.out.print(isPositive(7));
	}
}
