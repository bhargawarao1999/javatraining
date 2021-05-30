package com.vm.training.java.corejava.oops;

public class Test {

	public static void main(String[] args) {
		GrandFather grandfather =new GrandFather(70);
		
		Father f= new Father(0,50);
		grandfather.walk();
		f.walk();
		Son son = new Son(70,50,20);
		son.walk();
	}

}
