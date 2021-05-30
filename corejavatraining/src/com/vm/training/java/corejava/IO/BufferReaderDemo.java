package com.vm.training.java.corejava.IO;
import java.io.*;
public class BufferReaderDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("bhargawa.txt");
		FileReader fr = new FileReader("sachine.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String str = br.readLine();
		String str2 = null;
		while(str!=null)
		{
			str2=str2+str;
			str=br.readLine();
		}
		for(int i=str2.length()-1;i>=0;i--)
			bw.write(str2.charAt(i));
		bw.flush();
		bw.close();
	}
}
