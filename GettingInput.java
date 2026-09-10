package session2;

import java.util.Scanner;

public class GettingInput {
	public static void main(String[] args)
	{
		String name, address;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		name = input.next();
		System.out.println(name);
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println(age);
		input.nextLine();
		System.out.println("What is your address?");
		address = input.nextLine();
		System.out.println(address);
		input.close();
	}
}
