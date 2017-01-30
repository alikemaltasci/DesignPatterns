package com.designpatterns.structural.proxy;

public class NoCustomerFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;

	private String customerName; 
	
	public NoCustomerFoundException(String customerName) {
		this.customerName = customerName;
	}
	
	@Override
	public String getMessage() {
		return "No customer found with specifiedName: " + customerName;
	}

}
