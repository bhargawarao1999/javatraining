package com.vm.training.java.corejava.IO;
import java.io.*;
import java.util.*;
public class Employee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		File f = new File("sachine.txt");
		FileWriter fw = new FileWriter(f);
		//BufferedWriter bw = new BufferedWriter(fw);
		fw.write("ID       Name        Department\n");

		System.out.println("Want to enter Data? enter 1 or else enter any number");
		int n=input.nextInt();
		int i=n;
		while(i==1)
		{
			System.out.println("Enter ID,Name,Department");
			String  id=input.next();
			String name=input.next();
			String department = input.next();
			fw.write(id+"       "+name+"        "+department+"\n");
			System.out.println("want to continue enter 1 else enter any other number");
			i=input.nextInt();
		}
		fw.flush();
		fw.close();

	}

}
