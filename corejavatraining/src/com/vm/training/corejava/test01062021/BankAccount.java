package com.vm.training.corejava.test01062021;

public class BankAccount 
{
	public static void main(String[] args) 
	{
		SavingsAccount account = new SavingsAccount(20000, 6);
		System.out.println("Withdraw an amount of 9000");
		System.out.println("After withdrawing your balance is"+account.withdraw(9000));
		System.out.println("Bank interest is: "+account.interestBank());
	}
}
