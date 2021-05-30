package com.vm.training.java.corejava.oops;

public class Employee 
{
	int empId;
	String name;
	String dept;
	
	public Employee() {}

	Employee(int empId,String name,String dept)
	{
		this.empId=empId;
		this.name=name;//Employee Name
		this.dept=dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
//	public String toString()
//	{
//	return empId+" "+name+" "+dept;	
//	}
//	public static void main(String[] args) {
//		Employee emp = new Employee();
//		Employee emp1 = new Employee(1234,"Bhargawa","CSE");
//		System.out.println(emp);
//		System.out.println(emp1);
//	}
//
//	public void display() {
//		// TODO Auto-generated method stub
//		
//	}
}
