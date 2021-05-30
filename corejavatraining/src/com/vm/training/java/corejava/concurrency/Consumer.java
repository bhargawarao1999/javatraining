package com.vm.training.java.corejava.concurrency;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	BlockingQueue<Integer> commonQueue;
	public Consumer(BlockingQueue<Integer>commonQueue)
	{
		super();
		this.commonQueue=commonQueue;
	}
	@Override
	public void run() {
		while(true)
		{
			try
			{
				System.out.println("Consumer is taking"+commonQueue.take());
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}
