package com.vm.training.java.corejava.exception;

import java.sql.*;

public class ExceptionIdentity {
	public static void main(String[] args) {
		try
		{
			System.out.println(4/0);
			Connection con =new DriverManager.getConnection("","","");
		}
	}
}
