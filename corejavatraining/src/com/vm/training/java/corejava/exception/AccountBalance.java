package com.vm.training.java.corejava.exception;

import java.util.Scanner;

public class AccountBalance 
{
		public static void main(String[] args) {
			HDFC withdraw = new HDFC();
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Withdrawl Ammount");
			int withdrawl=input.nextInt();
			int minBalance =10000;
			int balance=10000;
			withdraw.balanceInAccount(balance, minBalance, withdrawl);
			withdraw.withdrawing();
		}
}
