package com.vm.training.java.corejava.oops;

public class Emp {
	int empID;
	String empName;
	Address address;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [empID=" + empID + ", empName=" + empName + ", address=" + address + "]";
	}
	
}
