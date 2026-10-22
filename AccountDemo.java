package session12;

public class AccountDemo {

	public static void main(String[] args) {
		 
		Account a1 = new Account("111", -100);
		System.out.println(a1);
		System.out.println(a1.getBalance());
		Account a2 = new Account("111", 100);
		System.out.println(a2);
		Account.test();
		
	}

}
