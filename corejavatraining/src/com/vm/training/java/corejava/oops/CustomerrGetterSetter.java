package com.vm.training.java.corejava.oops;

public class CustomerrGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setId(10001);
		customer.setfName("Bhargawa Rao");
		customer.setlName("T");
		customer.setAccount("Savings");
		System.out.println(customer.getId());
		System.out.println(customer.getfName());
		System.out.println(customer.getlName());
		System.out.println(customer.getAccount());
	}

}
