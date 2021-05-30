package com.vm.training.java.corejava.collection.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		ArrayList <Integer> studentMarks = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students");
		int numStudents=input.nextInt();
		System.out.println("Enter Marks");
		int mark;
		for(int i=1; i<=numStudents;i++)
		{
			mark = input.nextInt();
			studentMarks.add(mark);
		}
		Collections.sort(studentMarks);
		System.out.println("Highest Number: "+Collections.max(studentMarks));
		double average=0;
		int sum=0;
		for(int i=0;i<numStudents;i++)
		{
			sum=sum+studentMarks.get(i);
		}
		average=(double)sum/numStudents;
		System.out.println("Average:"+average);
		System.out.println("3rd Student marks: "+studentMarks.get(2));
		System.out.println("Marks: ");
		for(int i=0;i<numStudents;i++)
		{
			System.out.print(i+1+"-"+studentMarks.get(i)+" ");
		}
		Collections.sort(studentMarks);
		System.out.println("Sorted:");
		for(int i=0;i<numStudents;i++)
		{
			System.out.print(i+1+"-"+studentMarks.get(i)+" ");
		}
	}
}
