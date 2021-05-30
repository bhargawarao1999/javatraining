package com.vm.training.java.corejava.oops;


class Father extends GrandFather{
	int myAge;//Age of Father
	
	public Father(int age, int myAge) {
		super(age);
		this.myAge = myAge;
	}
	void walk() {
		System.out.println("i can't walk fast bcos my age is:"+myAge);
	}
}