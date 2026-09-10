package session4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile1 {

	public static void main(String[] args) throws FileNotFoundException {
		String fName;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		fName = input.nextLine();
		
		File myFile = new File(fName);
		Scanner readfile = new Scanner(myFile);
		while (readfile.hasNext()) {
			System.out.println(readfile.nextInt());
		}
		readfile.close();
	}
}
