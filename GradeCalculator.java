package assignment1;

import java.util.Scanner;
import java.io.*;

public class GradeCalculator {
	public static void main(String[] args) throws IOException {
		String courseName = "CMSC203";
		System.out.println("==============================================");
		System.out.println(" "+courseName+" Project 1 - Grade Calculator");
		System.out.println("==============================================");
		File myFile = new File("grades_input.txt");
		Scanner inputFile = new Scanner(myFile);
		String assignment = inputFile.nextLine();
		System.out.println(assignment);
	}

}
