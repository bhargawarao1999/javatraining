package com.vm.java.newFeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.vm.training.java.corejava.oops.Emp;

public class StreamDemo2 {
	public static void main(String[] args) {
		ArrayList<Employee> empolyeeList = new ArrayList<Employee>();
		empolyeeList.add(new Employee(1, "Ajay", "HR",18 ,50000));
		empolyeeList.add(new Employee(2, "Vijay", "DEV", 19,75000));
		empolyeeList.add(new Employee(3, "Raja", "HR", 20,60000));
		empolyeeList.add(new Employee(4, "Santosh", "DEV",21,40000));

		empolyeeList.stream().filter(s->s.getDept().equals("DEV")).forEach(s->System.out.println(s));
		empolyeeList.stream().filter(s->s.getName().startsWith("A")).forEach(s->System.out.println(s));
		System.out.println("Employee having salary greater than 50000: "+empolyeeList.stream().filter(s->s.getSalary()>50000).count());
		System.out.println("Name and length");
		empolyeeList.stream().map(m->m.getId()+" "+m.getName()+" "+m.getName().length()).forEach(m->System.out.println(m));
		System.out.println("After Increasing Salary");
		empolyeeList.stream().map(m->m.getId()+" "+m.getName()+" "+m.getDept()+" "+m.getAge()+" "+m.getSalary()*1.2).forEach(m->System.out.println(m));
		System.out.println("After Sorting");
		empolyeeList.stream().sorted((s1,s2)->
		{
			return s1.getName().compareTo(s2.getName());
		}).forEach(System.out::println);
		System.out.println("Again Sorting");
		empolyeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		System.out.println("Sort by Salary");
		List sortedList=empolyeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		sortedList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		Employee minSalary = empolyeeList.stream().min(Comparator.comparing(Employee::getSalary)).get();
		System.out.println("Minimum Salary: "+minSalary);
		
		long sum=empolyeeList.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		System.out.println("Sum: "+sum);
		
		long hrTotal=empolyeeList.stream().filter(s->s.getDept().equals("HR")).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		System.out.println("Total Salary of HRs: "+hrTotal);
		
		System.out.println("Using Distinct KeyWord");
		List distictKey=empolyeeList.stream().distinct().collect(Collectors.toList());
		distictKey.forEach(System.out::println);
		
		
		long sk=2;
		System.out.println("Using Skip:");
		empolyeeList.stream().skip(sk).forEach(System.out::println);
		System.out.println("Using Limit:");
		empolyeeList.stream().limit(sk).forEach(System.out::println);
		
	}
}
