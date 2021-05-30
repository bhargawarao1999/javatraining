package com.vm.training.java.corejava.IO;
import java.io.*;
import java.util.Scanner;
public class EvenNumberDisplay {
	public static void main(String[] args) throws IOException {
		FileReader fr =  new FileReader("number.txt");
		Scanner input = new Scanner(fr);
		BufferedReader br=new BufferedReader(fr);
		String str = br.readLine();
		String str2 = "";
		while(str!=null)
		{
			str2=str2+str;
			str=br.readLine();
		}
		String [] str3=str2.split(str2, 10);
	    System.out.println(str3.length);
	}
}
