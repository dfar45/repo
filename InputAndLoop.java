package session3;

import java.util.Scanner;

public class InputAndLoop {

	public static void main(String[] args) {
		int n1, n2, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		n1 = input.nextInt();
		n2 = input.nextInt();
		if (n2<n1) {
			temp = n2;
			n2 = n1;
			n1 = temp;
		}
		while (n1 <= n2) {
			if (n1 % 2 == 0) {
				System.out.print(n1);
			}
			n1++;
		}
	}
}
