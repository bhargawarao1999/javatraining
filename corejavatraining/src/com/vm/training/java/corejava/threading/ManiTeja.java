package com.vm.training.java.corejava.threading;

class ManiTeja extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			//System.out.println("Work Done by ManiTeja:"+i);
			System.out.println("Currently Executing Thread:"+Thread.currentThread().getName());
		}
	}
}
