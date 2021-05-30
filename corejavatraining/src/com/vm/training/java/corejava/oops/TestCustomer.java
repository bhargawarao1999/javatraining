package com.vm.training.java.corejava.oops;

public class TestCustomer
{
	

	public static void main(String[] args) 
	{
		Customer c1=new Customer();
		Customer c2=new Customer(10,"abcd");
		Customer c3=new Customer(10,"abcd","xyz");
		Customer c4=new Customer(10,"abcd","xyz","savings");
		Customer c5=new Customer();
	}
}
