package com.vm.training.java.corejava.collection.assignment;

public class Patient
{
	int patient_id;
	String patient_name;
	int patient_age;

	public Patient(int patient_id, String patient_name, int patient_age) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.patient_age = patient_age;
	}

			public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public int getPatient_age() {
		return patient_age;
	}
	public void setPatient_age(int patient_age) {
		this.patient_age = patient_age;
	}

	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", patient_name=" + patient_name + ", patient_age=" + patient_age
				+ "]";
	}






}