package session5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFileToDemo2 {
	public static void main(String[] args) throws FileNotFoundException {
		String name="";
		int age;
		PrintWriter outputFile;
		try {
			outputFile = new PrintWriter("names.bin");
			Scanner input = new Scanner(System.in);
			while (!name.equals("end")) {
				System.out.print("Enter your name: ");
				name = input.next();
				if (!name.equals("end")) {
					System.out.print("Enter your age: ");
					age = input.nextInt();
					outputFile.print("your name is "+name+" and age is "+age);
				}
				
			}
			outputFile.close();
		} catch (Exception e) {
			System.out.println("Something went wrong!");
		};
		
		System.out.println("End of program!");
		
	}
}