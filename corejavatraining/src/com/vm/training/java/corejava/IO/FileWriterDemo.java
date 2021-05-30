package com.vm.training.java.corejava.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("number.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("Bhargawa \n");
		fw.write("Hello ");
		fw.write(123);
		fw.flush();
		fw.close();
		System.out.println("Written in file");
		
	}
}
