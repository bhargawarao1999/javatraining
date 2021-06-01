package com.vm.training.corejava.test01062021;

public class SavingsAccount {
	private int balance;
	private int intrest;
	public SavingsAccount(int balance, int intrest) {
		super();
		this.balance = balance;
		this.intrest = intrest;
	}
	int withdraw(int withdraw)
	{
		if(balance>withdraw)
			balance = balance- withdraw;
		else 
			System.out.println("Less balance");
		return balance;
	}
	int depositeBalance(int deposite)
	{
		balance = balance+deposite;
		return balance;
	}
	int interestBank()
	{
		return interestBank();
	}
}
