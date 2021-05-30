package com.vm.training.java.corejava.oops;
//Example for static variable and method
public class A 
{
	static int i=1;
	A()
	{
		i++;
	}
	static void A1()
	{
		i++;
	}
	static void disp()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		A a1=new A();
		a1.disp();
		A.disp();
		A.disp();
		A.disp();
		A.disp();
	}
	interface Abcdef
	{
		
	}
}
