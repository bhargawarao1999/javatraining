package com.vm.training.java.corejava.IO;

import java.io.File;

public class FolderCreateDemo {
	public static void main(String[] args) {
		File f= new File("Movies");
		System.out.println(f.exists());
		f.mkdir();
	}
}
