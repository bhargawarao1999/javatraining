package com.vm.training.java.corejava.threading;

class Sashank extends Thread{
	public void run()
	{
		for(int i=40;i<=60;i++)
		{
			if(i==50)
				stop();
			//System.out.println("Work Done by Sashank:"+i);
			System.out.println("Currently Executing Thread:"+Thread.currentThread().getName());
		}
	}
}