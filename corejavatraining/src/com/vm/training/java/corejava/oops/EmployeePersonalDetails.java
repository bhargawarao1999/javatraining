package com.vm.training.java.corejava.oops;


public class EmployeePersonalDetails extends EmployeeDetails {
	String nationality;
	public EmployeePersonalDetails(int empId, String name, String dept, String emailID, String mobile, String address,String nationality) {
		super(empId, name, dept, emailID, mobile, address);
		this.nationality=nationality;
	}
	@Override
	public String toString() {
		return "EmployeePersonalDetails [nationality=" + nationality + ", emailID=" + emailID + ", mobile=" + mobile
				+ ", address=" + address + ", empId=" + empId + ", name=" + name + ", dept=" + dept + "]";
	}
	public static void main(String[] args) {
	EmployeePersonalDetails empPerDet=new EmployeePersonalDetails(1001, "Bhargawa", "CSE", "ab@c.com", "9493777777", "Guntur", "Indian");
	System.out.println(empPerDet);
	}

}
