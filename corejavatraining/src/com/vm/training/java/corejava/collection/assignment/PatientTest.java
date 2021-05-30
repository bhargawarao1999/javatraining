package com.vm.training.java.corejava.collection.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class sortByPatientId implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) 
	{
		// TODO Auto-generated method stub
		if(o1.getPatient_id()==o2.getPatient_id())
			return 0;
		else if(o1.getPatient_id()>o2.getPatient_id())
			return 1;
		else
			return -1;
	}

}
class sortByPatientName implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		return o1.getPatient_name().compareTo(o2.getPatient_name());
	}

}

public class PatientTest {


	static void display(Set<Patient> ts1)
	{
		Iterator<Patient> itr1=ts1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
	static void getPatientAge(Set<Patient> ts1)
	{
		for (Patient p : ts1) {
			System.out.println(p.getPatient_name()+"="+p.getPatient_age());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Patient> al=new ArrayList<Patient>();
		al.add(new Patient(159,"hdh", 21));
		al.add(new Patient(354,"aaa", 18));
		al.add(new Patient(350,"abc", 20));

		System.out.println("Total list of Patients");
		System.out.println(al);

		System.out.println("Sort by patient ID");
		Collections.sort(al,new sortByPatientId());
		for (Patient p: al) {
			System.out.println(p);
		}



		System.out.println("Sort by patient_name");
		Collections.sort(al,new sortByPatientName());
		Iterator<Patient> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());

		}
		
		
		System.out.println("Storing the array list data to set");
		Set<Patient> ts1=new HashSet<Patient>(al);
		display(ts1);


		System.out.println("Print patientName = PatientAge");
		getPatientAge(ts1);

	}

}