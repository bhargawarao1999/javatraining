package com.vm.training.java.corejava.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.write(98);
		pw.print(96);
		pw.flush();
		pw.close();
	}
}
