package com.vm.training.java.corejava.IO;

import java.io.File;
import java.io.IOException;

public class CreateDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("bhargawa.txt");
		if(f.exists())
		{
			System.out.println("File does  exist ");
		}
		else
		{
			System.out.println("File does not exist is being created");
			f.createNewFile();
			
		}
		
	}
}
