package model;

public class model {
	private int balance=10000;
	public int getBlance()
	{
		return balance;
	}
	public void withdraw(int amount)
	{
		balance = balance - amount;
	}
    public void deposite(int amount)
    {
    	balance = balance + amount;
    }
}
