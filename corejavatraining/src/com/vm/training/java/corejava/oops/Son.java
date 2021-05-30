package com.vm.training.java.corejava.oops;

class Son extends Father 
{

int myTeenAge;

public Son(int age, int myAge, int myTeenAge) 
	{
	super(age, myAge);
	this.myTeenAge = myTeenAge;
	}

void walk() {
	System.out.println("i can walk fast bcos my age is:"+myTeenAge);
	}
}