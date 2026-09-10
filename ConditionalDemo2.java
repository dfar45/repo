package session2;

import java.util.Scanner;

public class ConditionalDemo2 {
	public static void main(String[] args)
	{
		/**
		 * Ask the user to enter age and show
		 * error message if age is 0 or negative
		 */
		int age;
		Scanner in = new Scanner(System.in);
		System.out.println("What is your age?");
		age = in.nextInt();
		
		if (age <= 0 || age > 120)
		{
			System.out.println("Age is invalid!");
		} else {
			if (age == 50) {
				System.out.println("Nice!");
			}
			System.out.println(age);
		}
	}
}
