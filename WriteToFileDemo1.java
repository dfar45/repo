package session5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFileDemo1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		PrintWriter outputFile = new PrintWriter("names.txt");
		while (!name.equals("end) {
			System.out.print("Enter your name: ");
			name = input.next();
			System.out.print("Enter your age: ");
			age = input.nextInt();
			outputFile.print("your name is "+name+" and age is "+age);
		}
		outputFile.close();
	}
}
