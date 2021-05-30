package com.vm.training.java.corejava.IO;
import java.io.*;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		File f= new File("sachine.txt");
		FileReader fr = new FileReader(f);
		int readchar = fr.read();
		while(readchar!=-1)
		{
		System.out.print((char)readchar);
		readchar=fr.read();
		}
	}
}
