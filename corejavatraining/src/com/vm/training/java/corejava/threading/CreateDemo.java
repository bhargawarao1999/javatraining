package com.vm.training.java.corejava.threading;

public class CreateDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.start();
		Student stu = new Student();
		Thread thread = new Thread(stu);
		thread.start();
	}
}
