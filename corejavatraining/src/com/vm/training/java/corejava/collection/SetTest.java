package com.vm.training.java.corejava.collection;

import java.util.ArrayList;

class Employee 
{
	int empID;
	String empName;
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}
	
}
class EmployeeDetails extends Employee{
	String panNumber;
	String aadharNumber;
	
	public EmployeeDetails(int empID, String empName, String panNumber, String aadharNumber) {
		super(empID, empName);
		this.panNumber = panNumber;
		this.aadharNumber = aadharNumber;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [panNumber=" + panNumber + ", aadharNumber=" + aadharNumber + ", empID=" + empID
				+ ", empName=" + empName + "]";
	}
	
}

public class SetTest 
{
	public static void main(String[] args) {
		EmployeeDetails emp1=new EmployeeDetails(100, "Bhargawa", "1230", "1234567");
		ArrayList<EmployeeDetails> array = new ArrayList<>();
		array.add(emp1);
		System.out.println(emp1);
		
	}
}
