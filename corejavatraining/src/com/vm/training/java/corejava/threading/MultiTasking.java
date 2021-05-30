package com.vm.training.java.corejava.threading;

public class MultiTasking {
	public static void main(String[] args) {
		ManiTeja mani = new ManiTeja();
		Sasi sasi = new Sasi();
		Sashank shanks = new Sashank();
		mani.setName("Mani Teja");
		sasi.setName("Sasi");
		shanks.setName("Sashanks");
		mani.start();
		sasi.start();
		shanks.start();
	}
}
