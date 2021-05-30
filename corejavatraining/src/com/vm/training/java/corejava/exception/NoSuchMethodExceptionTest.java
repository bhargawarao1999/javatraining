package com.vm.training.java.corejava.exception;

public class NoSuchMethodExceptionTest {
	void NoSuchMethodExceptionTest(int i,int j)
	{
		
	}
	NoSuchMethodExceptionTest() throws Exception	{
		Class i;
		try {
			i = Class.forName("java.lang.String");
			try {
				Class[] p = new Class[5];
				
				System.in.read();
			}
			catch (SecurityException e) {
				e.printStackTrace();
			}
			catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception
	{
		new NoSuchMethodExceptionTest();
	}
}
