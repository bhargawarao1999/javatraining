package com.vm.training.java.corejava.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSeriliazationDemo implements Serializable
{
	public static void main(String[] args) throws IOException, Exception {
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp =(Employee) ois.readObject();
		System.out.println(emp.id+" "+emp.name+" "+emp.address);
	}
}
