package com.vm.training.java.corejava.threading;

class Sasi extends Thread{
	public void run()
	{
		for(int i=20;i<=30;i++)
		{
			//System.out.println("Work Done by Sasi:"+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Currently Executing Thread:"+Thread.currentThread().getName());
		}
	}
}
