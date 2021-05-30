package com.vm.training.java.corejava.threading;

class Account
{
	public void withdrawOrDeposite(int time)
	{
		synchronized (this) {
			for(int i=1;i<=time;i++)
				System.out.println(Thread.currentThread().getName()+" process is being done");
		}


		for(int i=1;i<=time;i++)
			System.out.println(Thread.currentThread().getName()+" process ");
	}
}
class Transaction implements Runnable
{
	Account account = new Account();
	public void run() {
		account.withdrawOrDeposite(3);
	}
}
public class BalanceWithdrawOrEnquiry {
	public static void main(String[] args) {
		Transaction transaction= new Transaction();
		Thread deposite = new Thread(transaction);
		Thread withdraw = new Thread(transaction);
		deposite.setName("Deposite");
		withdraw.setName("Withdraw");
		deposite.start();
		withdraw.start();
	}
}
