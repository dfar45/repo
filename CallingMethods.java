package session7;

import java.util.Scanner;

public class CallingMethods {
	/**
	 * finds the double of a number passed as
	 * parameter and returns the result.
	 * @param x
	 * @return
	 */
	public static int doubleNum(int x) {
		return x*2;
	}
	/**
	 * Prompts the user for a number and displays
	 * the double of the entered number.
	 */
	public static void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		System.out.print(doubleNum(input.nextInt()) );
	}
	public static void main(String[] args) {
		getInput();
	}
}
