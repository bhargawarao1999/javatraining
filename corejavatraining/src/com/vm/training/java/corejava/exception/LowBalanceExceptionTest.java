package com.vm.training.java.corejava.exception;

public class LowBalanceExceptionTest 
{
	public static void main(String[] args) {
		int balance=900;
		try {
			if(balance<1000)
			{
				throw new LowBalanceException("Insufficient funds");
			}
		}
		catch (LowBalanceException e) {
			e.printStackTrace();
		}
	}
}
