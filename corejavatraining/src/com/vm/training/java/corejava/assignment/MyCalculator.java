package com.vm.training.java.corejava.assignment;

public class MyCalculator implements IAdvancedArithmatic {

	@Override
	public int divisor(int number) {
		// TODO Auto-generated method stub
		int sum=number;
		int increment;
		for( increment=1;increment<number;increment++)
		{
			if(number%increment==0)
			{
				sum=sum+increment;
			}
		}
		return sum;
	}

}