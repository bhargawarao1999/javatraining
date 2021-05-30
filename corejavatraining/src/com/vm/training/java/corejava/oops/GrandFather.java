package com.vm.training.java.corejava.oops;

public class GrandFather {
	int age;
	
	//GrandFather constructor
	public GrandFather(int age) {
		super();
		this.age = age;//Initializing age using "this" keyword. The member varible age will be initialized
	}


	void walk() {
		System.out.println("i can't walk fast bcos my age is:"+age);
	}
}
