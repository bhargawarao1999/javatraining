package com.vm.training.java.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest2
{
	static boolean search(ArrayList array,Integer key)
	{
		return array.contains(key);
	}
	static void printList(ArrayList array)
	{
		System.out.println(array);
	}
	static ArrayList sortAscending(ArrayList array)
	{
		Collections.sort(array);
		return array;
	}
	static ArrayList sortDescending(ArrayList array)
	{
		Collections.reverse(array);
		return array;
	}
	static int oddSum(ArrayList array)
	{
		int sum=0;
		Iterator itr = array.iterator();
		while(itr.hasNext())
		{
			int i=(int) itr.next();
			if(i%2==1)
				sum=sum+i;
		}
		return sum;
	}
	static int evenSum(ArrayList array)
	{
		int sum=0;
		Iterator itr = array.iterator();
		while(itr.hasNext())
		{
			int i=(int) itr.next();
			if(i%2==1)
				sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(5);
		array.add(3);
		array.add(100);
		//		System.out.println(search(array,11));
		if(search(array,11))
			System.out.println("Element is found");
		else 
			System.out.println("Element not found");
		sortAscending(array);
		sortDescending(array);

	}
}
