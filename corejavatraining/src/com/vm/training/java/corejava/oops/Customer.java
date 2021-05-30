package com.vm.training.java.corejava.oops;
// Constructor Experiment
public class Customer 
{
	private int id;
	private String fName;//First Name
	private String lName;//Last Name
	private String account;//Type of Account
	
	
	/*/Constructor with 2 parameters
	public Customer(int id, String fName) {
		super();
		this.id = id;//Customer ID
		this.fName = fName;
		System.out.println(id+fName);
	}
	//Constructor with 3 parameters
	public Customer(int id, String fName, String lName) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		System.out.println(id+fName+lName);
	}
	//Constructor with 4 parameters
	public Customer(int id, String fName, String lName, String account) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.account = account;
		System.out.println(id+fName+lName+account);
	}*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	//Default Constructor
	
	 public Customer() { System.out.println("Default"); }
	
	
	/*private void show()
	{
		System.out.println(id);
		System.out.println(f);
		System.out.println(l);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(d);
		System.out.println(b1);
		System.out.println(b);
	}*/
}
