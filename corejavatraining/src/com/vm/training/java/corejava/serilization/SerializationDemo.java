package com.vm.training.java.corejava.serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		Employee emp = new Employee(1, "Bhargawa", "Guntur");
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
	}
}
