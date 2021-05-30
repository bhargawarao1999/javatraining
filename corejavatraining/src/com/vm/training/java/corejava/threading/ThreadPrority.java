package com.vm.training.java.corejava.threading;

public class ThreadPrority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManiTeja mani = new ManiTeja();
		Sashank shanks= new Sashank();
		Sasi sasi = new Sasi();
		System.out.println(mani.getPriority());
		System.out.println(shanks.getPriority());
		System.out.println(sasi.getPriority());
	}

}
