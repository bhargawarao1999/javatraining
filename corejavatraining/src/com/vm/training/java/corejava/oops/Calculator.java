package com.vm.training.java.corejava.oops;

public class Calculator 
{
	int num1,num2,num3,num4,sum=0;//num=Number
	double sum1=0,f;

	/*public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}*/

	int add(int num1, int num2)
	{
		sum = num1+num2;
		return sum;
	}
	double add(int num1, double f)
	{
		sum1 = num1+f;
		return sum1;
	}
	int add(int num1,int num2,int num3)
	{
		sum = num1+num2+num3;
		return sum;
	}
	int add(int num1, int num2,int num3,int num4)
	{
		sum = num1+num2+num3+num4;
		return sum;
	}
}
