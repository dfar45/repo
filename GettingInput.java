package session2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GradeCalculator {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("==============================================");
		System.out.println(" CMSC203 Project 1 - Grade Calculator");
		System.out.println("==============================================");
		File myFile = new File("grades_input.txt");
		File bFile = new File("gradeconfig.txt");
		Scanner inputFile = new Scanner(myFile);
		String firstName, lastName;
		System.out.println("Loading configuration from "+bFile);
		System.out.println("Configuration loaded successfully.");
		PrintWriter outputFile = new PrintWriter("grades_report.txt");
		System.out.println();
		System.out.println("Using input file: "+myFile);
		System.out.println("Using output file: grades_report.txt");
		System.out.println("Reading student score...");
		System.out.println();
		System.out.print("Student: ");
		inputFile.hasNext();
		firstName = inputFile.nextLine();
		lastName = inputFile.nextLine();
		System.out.println(firstName+" "+lastName);
		Scanner nextFile = new Scanner(bFile);
		System.out.println("Course: "+nextFile.nextLine());
		outputFile.println(firstName+" "+lastName);
		System.out.println();
		double sum, average;
		float overall = 0;
		System.out.println("Category Results:");
		while (inputFile.hasNext()) {
			String category = nextFile.next();
			int percent = nextFile.nextInt();
			int maximum = inputFile.nextInt();
			sum = 0;
			average = 0;
			for (int x = 1; x <= maximum; x++) {
				sum += inputFile.nextDouble();
				average = sum / maximum;
			}
			System.out.println(category+" ("+percent+"%): average = "+average);
			overall += (average * percent * 0.01);
			outputFile.println(category+" ("+percent+"%): average = "+average);
		}
		System.out.println();
		Scanner apply = new Scanner(System.in);
		char letterGrade;
		String answer, finalGrade = null;
		System.out.print("Apply +/- grading? (Y/N): ");
		answer = apply.next();
		System.out.println("Overall Numeric Average: "+overall);
		if (overall >= 90 && overall <= 100) {
			letterGrade = 'A';
		} else if (overall >= 80 && overall <= 90) {
			letterGrade = 'B';
		} else if (overall >= 70 && overall < 80) {
			letterGrade = 'C';
		} else if (overall >= 60 && overall < 70) {
			letterGrade = 'D';
		} else {
			letterGrade = 'F';
		}
		System.out.println("Base letter grade: "+letterGrade);
		outputFile.println("Numeric grade: "+overall);
		if (answer.equals("Y")) {
			if (overall > 97.5 && overall <= 100) {
				finalGrade = "A+";
			} else if (overall >= 90 && overall < 92.5) {
				finalGrade = "A-";
			} else if (overall >= 92.5 && overall <= 97.5) {
				finalGrade = "A";
			} else if (overall > 87.5 && overall < 90) {
				finalGrade = "B+";
			} else if (overall >= 80 && overall < 82.5) {
				finalGrade = "B-";
			} else if (overall >= 82.5 && overall <= 87.5){
				finalGrade = "B";
			} else if (overall > 77.5 && overall < 80) {
				finalGrade = "C+";
			} else if (overall >= 70 && overall < 72.5) {
				finalGrade = "C-";
			} else if (overall >= 72.5 && overall <= 77.5) {
				finalGrade = "C";
			} else if (overall > 67.5 && overall < 70) {
				finalGrade = "D+";
			} else if (overall >= 60 && overall < 62.5) {
				finalGrade = "D-";
			} else {
				finalGrade = "D";
			}
			System.out.println("Final letter grade: "+finalGrade);
			outputFile.println("Final grade: "+finalGrade);
		}
		System.out.println();
		System.out.println("Summary written to grades_report.txt");
		System.out.println("Program complete. Goodbye!");
		inputFile.close();
		nextFile.close();
		outputFile.close();
	}

}
