package com.vm.training.java.corejava.threading;

class Talking
{
	synchronized public void talking(int time)
	{
		for(int i=1;i<=time;i++)
			System.out.println(Thread.currentThread().getName()+" is on call");
	}
}
class STD implements Runnable
{
	Talking talk = new Talking();
	public void run() {
		talk.talking(6);
	}
}
public class STDBooth {
	public static void main(String[] args) {
		STD std= new STD();
		Thread mani = new Thread(std);
		Thread sasi = new Thread(std);
		mani.setName("ManiTeja");
		sasi.setName("Sasi");
		mani.start();
		sasi.start();
	}
}
