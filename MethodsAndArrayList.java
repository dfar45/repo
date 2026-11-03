package session17;

import java.util.ArrayList;

import session14.Account;

public class MethodsAndArrayList {

	public static void main(String[] args) {
		ArrayList<Account> accounts = new ArrayList<>();
		addAccount(accounts, "111", 2000);
		addAccount(accounts, "", 200);
		addAccount(accounts, "222", 3000);
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i));
		}
		Account oldAccount = new Account("222", 3000);
		updateBalance(accounts, oldAccount, 5000);
		System.out.print(accounts);

	}
	public static void addAccount(ArrayList<Account> arr, String id, double balance) {
		if (id != "") {
			arr.add(new Account(id, balance));
		}
	}
	public static boolean updateBalance(ArrayList<Account> ree, Account a, double balance) {
		for (int i = 0; i < ree.size(); i++) {
			if (ree.get(i).equals(a)) {
				ree.get(i).setBalance(balance);
				return true;
			}
		}
		return false;
	}

}
