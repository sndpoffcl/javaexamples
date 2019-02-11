package com.cg.fileiodemo.beans;

import java.io.Serializable;

public class Customer implements Serializable{
	private static int CUSTOMER_ID_COUNTER = 100;
	
	private int custId;
	private String firstName, lastName; 
	private transient Address address;
	public Customer() {}
	public Customer(int custId, String firstName ,String lastName , Address address) {
		super();
		this.custId = custId;
		this.firstName = firstName; 
		this.lastName = lastName;
		this.address = address;
		
	}
	public static int getCUSTOMER_ID_COUNTER() {
		return CUSTOMER_ID_COUNTER;
	}
	public static void setCUSTOMER_ID_COUNTER(int cUSTOMER_ID_COUNTER) {
		CUSTOMER_ID_COUNTER = cUSTOMER_ID_COUNTER;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
