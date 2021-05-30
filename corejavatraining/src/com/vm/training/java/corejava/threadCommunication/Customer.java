package com.vm.training.java.corejava.threadCommunication;

public class Customer {
	int balance=10000;
	synchronized public int withdraw(int amount)
	{
		if(balance<amount)
		{
			System.out.println("Waiting you don't have sufficient balance");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" withdrawing");
		balance-=amount;
		return balance;
	}
	synchronized public int deposit(int amount)
	{
		balance+=amount;
		System.out.println(Thread.currentThread().getName()+" Depositing the amount");
		return balance;
	}
}
