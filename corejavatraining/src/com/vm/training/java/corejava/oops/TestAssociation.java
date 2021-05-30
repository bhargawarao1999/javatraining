package com.vm.training.java.corejava.oops;

public class TestAssociation {
	public static void main(String[] args) 
	{
		showAggregation();
	}
	public static void showAggregation()
	{
		Emp emp = new Emp();
		Address address = new Address();
		emp.setEmpID(20001);
		emp.setEmpName("Bhargawa");
		emp.setAddress(address);
		address.setCity("Guntur");
		address.setState("AP");
		address.setCountry("India");
		System.out.println(emp);
		System.out.println("------------------------------------------------------------");
		emp=null;
		System.out.println(emp);
		System.out.println(address);
	}
}
