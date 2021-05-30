package com.vm.training.java.corejava.oops;
//Setter Getter methods execution
public class EmployeeGetterSetterTest {
	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		
		
		//Setter methods
		employeeDetails.setEmpId(1000001);
		employeeDetails.setName("Bhargawa");
		employeeDetails.setDept("CSE");
		employeeDetails.setAddress("Guntur");
		employeeDetails.setEmailID("ab@c.com");
		employeeDetails.setMobile("1234567890");
		
		
		//Executing Getter methods
		System.out.println(employeeDetails.getEmpId());
		System.out.println(employeeDetails.getName());
		System.out.println(employeeDetails.getDept());
		System.out.println(employeeDetails.getAddress());
		System.out.println(employeeDetails.getEmailID());
		System.out.println(employeeDetails.getMobile());
		
		
	}
}
