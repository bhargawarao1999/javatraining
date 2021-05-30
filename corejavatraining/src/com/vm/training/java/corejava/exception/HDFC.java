package com.vm.training.java.corejava.exception;

public class HDFC implements IBank
{
	int balance;
	int minBalance;
	int withdrawl;
	public void balanceInAccount(int balance,int minBalance,int withdrawl) {
		this.balance=balance;
		this.minBalance=minBalance;
		this.withdrawl=withdrawl;
	}
	void withdrawing()
	{
		try
		{
		if(balance>minBalance&&minBalance-balance>(minBalance+200))
		{
			System.out.println("After withdrawing Balance:"+(minBalance-balance));
			throw new MaintainMinimumBalance("You are maintining your minimum balance");
		}
		else if(balance>minBalance&&minBalance-balance<minBalance)
		{
			System.out.println("After withdrawing Balance:"+(minBalance-balance));
			throw new AverageMonthlyCharges("Charges are More when balance is less than 10000");
		}
		else if(balance-minBalance<=100)
		{
			throw new LowBalanceException("Your Blance is low");
		}
		else if(balance<minBalance)
		{
			throw new MoneyOnHold("Your balance is less than minimum balance so you cannot withdraw cash. Please visit the bank");
		}
		else
			System.out.println("Wrong Input");
		}
		catch (MaintainMinimumBalance e1) {
			e1.printStackTrace();
		}
		catch (AverageMonthlyCharges e2) {
			e2.printStackTrace();
			// TODO: handle exception
		}
		catch (LowBalanceException e3) {
			e3.printStackTrace();
			// TODO: handle exception
		}
		catch (MoneyOnHold e4) {
			e4.printStackTrace();
			// TODO: handle exception
		}
	}
}
