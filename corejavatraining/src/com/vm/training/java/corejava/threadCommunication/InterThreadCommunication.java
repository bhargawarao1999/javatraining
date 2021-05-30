package com.vm.training.java.corejava.threadCommunication;

public class InterThreadCommunication {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Thread t1= new Thread()
		{
			public void run()
			{
				System.out.println(customer.withdraw(11000));
			}
		};
		Thread t2 = new Thread()
		{
			public void run()
			{
				System.out.println(customer.deposit(5000));
			}
		};
		t1.setName("Bhargawa");
		t2.setName("Bhargawa");	
		t1.start();
		t2.start();
		}

}
