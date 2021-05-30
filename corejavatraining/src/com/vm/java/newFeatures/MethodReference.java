package com.vm.java.newFeatures;
interface Validate
{
	void validation();
}
class FaceBook
{
	void otp()
	{
		System.out.println("Validate using OTP");
	}
}
public class MethodReference 
{
	public static void main(String[] args) {
		FaceBook fb= new FaceBook();
		Validate v= fb::otp;
		v.validation();
	}
}
