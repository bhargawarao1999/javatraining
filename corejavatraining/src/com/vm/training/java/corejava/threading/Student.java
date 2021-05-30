package com.vm.training.java.corejava.threading;

class Student implements Runnable{

	@Override
	public void run() {
		System.out.println("This is task of student");
	}

}
