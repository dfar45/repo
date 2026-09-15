package session5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFileDemo1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.next();
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		PrintWriter outputFile = new PrintWriter("names.txt");
		outputFile.print("your name is "+name+" and age is "+age);
		outputFile.close();
	}
}
