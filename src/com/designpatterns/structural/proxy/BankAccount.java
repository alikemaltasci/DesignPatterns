package com.designpatterns.structural.proxy;

public interface BankAccount {
	public double getCurrencyOfCustomer(String customerName) throws NoCustomerFoundException;
}
