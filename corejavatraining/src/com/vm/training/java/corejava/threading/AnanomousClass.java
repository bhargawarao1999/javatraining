package com.vm.training.java.corejava.threading;

public class AnanomousClass {
	public static void main(String[] args) {
		Parent p1= new Parent();
		p1.phone();
		Parent p2= new Parent()
		{
			void phone()
			{
				System.out.println("RedMI phone");
			}
		};
		p2.phone();
	}
}
