package com.vm.training.java.corejava.exception;

import java.io.*;
import java.sql.*;
public class TryWithResources {

	public static void main(String[] args)  {
		try(FileOutputStream fos = new FileOutputStream(new File("D:/bhargawa.txt"));Connection con=DriverManager.getConnection("url","un","pwd"))
		{
			String s="ValueMomentum";
			byte[] by= s.getBytes();
			fos.write(by);
			System.out.println("Success");
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

}
