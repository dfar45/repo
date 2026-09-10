package session4;

import java.util.Scanner;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double i = input.nextDouble();
		double sum = 0;
		System.out.println(Math.sqrt(i));
		for(int x = 1; x <= i; x++) {
			sum += x;
		}
		System.out.print(sum);
		input.close();
	}
}
