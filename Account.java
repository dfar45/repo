package session12;

public class Account {
	String accId;
	double balance;
	//Construtor
	public Account(String accId, double balance)
	{
		if ( balance > 0)
		{
			this.accId = accId;
			this.balance = balance;
		}
	}
	public String getAccId()
	{
		return this.accId;
	}
	public void setAccId(String accId)
	{
		this.accId = accId;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public void deposit( double amount)
	{
		this.balance +=amount;
	}
	public  boolean withdraw(double amount)
	{
		if (this.balance < amount)
			return false;
		this.balance -=amount;
		return true;
	}
	
	public static void test()
	{
		
	}
	
	public String toString()
	{
		return this.accId+ " " + this.balance;
	}
	
	
}
