package com.vm.training.corejava.test01062021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public interface WWEWrestlerimplementation 
{
	static long numberOfWrestlesr(ArrayList<WWE> wrestlersList)
	{
		long count =0;
		count= wrestlersList.stream().count();
		return count;
	}
	static long sumOfWeightOfWrestlers(ArrayList<WWE> wrestlersList)
	{
		long sum=0;
		sum= wrestlersList.stream().filter(s->s.getWeight()>200).collect(Collectors.summarizingInt(WWE::getWeight)).getSum();
		return sum;
		
	}
	static List firstNameOfWrestler(ArrayList<WWE> wrestlersList)
	{
		List firstName=wrestlersList.stream().map(m->m.getFirstName()).collect(Collectors.toList());
		return firstName;
	}
//	static List sortByFirstNameOfWrestler(ArrayList<WWE> wrestlersList)
//	{
//		List firstName=wrestlersList.stream().sorted(Comparator.comparing(WWE::getFirstName)).collect(Collectors.toList());
//		return (List)firstName;
//	}
	public static void main(String[] args) 
	{
		ArrayList<WWE> wrestlersList=new ArrayList<WWE>();
		wrestlersList.add(new WWE("John ", "Cena", 150));
		wrestlersList.add(new WWE("Khali ", "Great", 250));
		wrestlersList.add(new WWE("UnderTaker ", "King", 230));
		wrestlersList.add(new WWE("The ", "Beast", 240));
		wrestlersList.add(new WWE("The", "Snake", 110));
		
		System.out.println("Number of Wrestlers: "+numberOfWrestlesr(wrestlersList));
		System.out.println("Sum of all weight of all wrestlers whose weight is above 200: "+sumOfWeightOfWrestlers(wrestlersList));
		System.out.println("Wrestlers First Name: "+firstNameOfWrestler(wrestlersList));
		System.out.println("Sort by First Name: ");
		wrestlersList.stream().sorted(Comparator.comparing(WWE::getFirstName)).forEach(System.out::println);
		
	}
}
