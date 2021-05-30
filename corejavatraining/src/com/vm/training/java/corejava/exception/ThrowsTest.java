package com.vm.training.java.corejava.exception;


class Training
{
	void train() throws Exception   //Cannot handle exception
	{
		System.out.println("I train java");
	}
	void trainSpecificSubject() throws Exception //Cannot handle exception
	{
		train();
		System.out.println("I train Angular");
	}
	void trainAllSubject() throws Exception //Cannot handle exception
	{
		trainSpecificSubject();
		System.out.println("I train all subject");
	}
}
public class ThrowsTest {
	public static void main(String[] args) throws Exception //Cannot handle exception so JVM handles the Exception 
	{
		Training trainer = new Training();
		trainer.trainAllSubject();
	}
}
