package com.vm.training.java.corejava.assignment;

public class Nokia extends Mobile implements IMobile//Inheritence
{
	public void Mobile()
	{
		System.out.println("I am the mobile");
	}
	public void Mobile(float version)
	{
		System.out.println("I am the new version mobile "+version);
		
	}
	void calculator() {
		System.out.println("I have calculator");
	}
	void bluetooth()
	{
		System.out.println("I have bluetooth");
	}
	@Override
	public void sensor() {
		// TODO Auto-generated method stub
		System.out.println("I have sensor");
	}
	@Override
	public void voiceRecognition() {
		// TODO Auto-generated method stub
		System.out.println("I can recognise voice of the owner");
	}
	
}
