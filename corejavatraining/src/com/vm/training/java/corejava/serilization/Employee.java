package com.vm.training.java.corejava.serilization;

import java.io.Serializable;

public class Employee implements Serializable{
int id;
String name;
String address;
public Employee(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}


}
