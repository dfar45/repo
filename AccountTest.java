package session14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	private Account a1, a2;
	
	@BeforeEach
	public void setUp() {
		a1 = new Account("111", -200);
		a2 = new Account("112", 200);
	}
	@Test
	public void testGetBalance() {
		assertEquals(0, a1.getBalance());
		
		assertEquals(200, a2.getBalance());
	}

	@Test
	public void testDeposit() {
		a1.deposit(100);
		assertEquals(100, a1.getBalance());
		a2.deposit(100);
		assertEquals(300, a2.getBalance());
	}

	@Test
	public void testWithdraw() {
		a1.withdraw(100);
		assertTrue(a1.getBalance() == 0);
		a1.setBalance(200);
		a1.withdraw(100);
		assertTrue(a1.getBalance() == 100);
	}

}
