package com.vm.training.java.corejava.assignment;

public class IncreasingDecreasingOrder 
{
	public static void main(String[] args) 
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		int[] num1Arr=new int [args[0].length()];
		int[] num2Arr=new int [args[1].length()];
		int[] num3Arr=new int [args[2].length()];
		int increment;
		for(increment=args[0].length()-1;increment>0;increment--)
		{
			num1Arr[0]=num1%10;
			num1=num1/10;
		}
		for(increment=args[1].length()-1;increment>0;increment--)
		{
			num2Arr[0]=num1%10;
			num2=num2/10;
		}
		for(increment=args[2].length()-1;increment>0;increment--)
		{
			num3Arr[0]=num3%10;
			num3=num3/10;
		}
		for(increment=0;increment<args[0].length();increment++)
		{
			
		}
	}
}
