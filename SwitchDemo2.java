package session3;

import java.util.Scanner;

public class SwitchDemo2 {
	public static void main(String [] args) {
		int day;
		Scanner input = new Scanner(System.in);
		day = input.nextInt();
		if (day >= 1 && day <= 5) {
			System.out.print("workday");
		} else if (day == 6 || day == 7) {
			System.out.print("weekend");
		} else {
			System.out.print("error");
		}
	}
}
