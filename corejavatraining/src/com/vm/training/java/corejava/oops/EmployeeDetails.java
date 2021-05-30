package com.vm.training.java.corejava.oops;

public class EmployeeDetails extends Employee
{
	String emailID;//Employee email ID
	String mobile;// Employee mobile number
	String address;//Address of employee
	public EmployeeDetails() {
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
//	public String toString() {
//		return empId+" "+name+" "+dept+" "+" "+emailID+" "+mobile+" "+address;
//	}
//	public static void main(String[] args) 
//	{
//		EmployeeDetails emp =new EmployeeDetails(1234567,"abcd","CSE","abc@gmail.com","5467821394","Guntur");
//		System.out.println(emp);
//	}
}
