package session3;

import java.util.Scanner;

public class ConvertIftoSwitch {
	public static void main(String [] args) {
		int day;
		Scanner keyboard = new Scanner(System.in);
		day = keyboard.nextInt();
		switch (day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.print("workday");
				break;
			case 6:
			case 7:
				System.out.print("weekend");
				break;
			default:
				System.out.print("error");
		}
		}
}
