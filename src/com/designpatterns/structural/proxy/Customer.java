package com.designpatterns.structural.proxy;

public class Customer {

	private String name;
	private String lastName;
	private double currency;

	
	public Customer(String name, String lastName, double currency) {
		this.name = name;
		this.lastName = lastName;
		this.currency = currency;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getCurrency() {
		return currency;
	}

	public void setCurrency(double currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", lastName=" + lastName + ", currency=" + currency + "]";
	}

}
