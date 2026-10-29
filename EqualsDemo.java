package session16;

import session14.Account;

public class EqualsDemo {

	public static void main(String[] args) {
		int x = 7, y = 6;
		System.out.println(x == y);
		
		Account a1 = new Account("111", 100);
		Account a2 = new Account("222", 100);
		Account a3 = new Account("222", 100);
		System.out.println(a2.equals(a3));

	}

}
