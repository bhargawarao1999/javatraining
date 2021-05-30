package com.vm.java.newFeatures;
interface Test
{
	void display();
}
interface Calculate
{
	int add(int a, int b);
}
interface BiggerNUmber
{
	int biggerNumber(int a,int b);
}
interface StringLength
{
	int lengthOfString(String s);
}
interface StringReverse
{
	String reverseString(String s);
}
interface SumOfArray
{
	int sumOfArray(int [] arr);
}
interface SmallestNumber
{
	int smallest(int []arr);
}
public class LamdaExpression {
	public static void main(String[] args) {
		Test t= ()-> System.out.print("1234");
		t.display();
		
		//Number Addition
		Calculate c1= (a,b)->a+b;
		System.out.println("Addition: "+c1.add(10,20));
		
		//Bigger Number
		BiggerNUmber big = (a,b)->
		{
			if(a>b)
				return a;
			else 
				return b;
		};
		System.out.println("Bigger number is"+big.biggerNumber(5, 10));
		
		//Length of String
		StringLength sl = (s)->s.length();
		System.out.println("Length of string is: "+sl.lengthOfString("abcdefgh"));
		//Reverse String
		StringReverse sr=(s)->
		{
			String s1="";
			for(int i=s.length()-1;i>=0;i--)
				s1=s1+s.charAt(i);
			return s1;
		};
		System.out.println("Reverse string: "+sr.reverseString("abcdef"));
		
		SumOfArray arra1= (arr)->
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i];
			}
			return sum;
		};
		int arr[]= {10,20,30,40,50};
		System.out.println("Sum of array: "+arra1.sumOfArray(arr));
		SmallestNumber sn = (arr1)->
		{
			int small = arr1[0];
			for(int i=1;i<arr1.length;i++)
			{
				if(small>arr1[i])
					small=arr1[i];
			}
			return small;
		};
		System.out.println("Smallest number: "+sn.smallest(arr));
	}

}

