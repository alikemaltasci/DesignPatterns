package com.designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class RealBankAccount implements BankAccount {
	
	private Map<String,Customer> customerMap;
	
	public RealBankAccount() {
		customerMap = new HashMap<String,Customer>();
		//assume getting customer data from db
		customerMap.put("Ali Kemal Tasci",new Customer("Ali Kemal", "Tasci", 3.0));
		customerMap.put("Ertugrul Tasci",new Customer("Ertugrul", "Tasci", 5.0));
		customerMap.put("Omer Semih Tasci",new Customer("Omer Semih", "Tasci", 6.0));
		System.out.println("Data has been loaded");
	}
	
	public void addCustomer(Customer customer){
		String customerName = customer.getName() + " " + customer.getLastName();
		customerMap.put(customerName, customer);		
	}
	
	public void deleteCustomer(Customer customer){
		String customerName = customer.getName() + " " + customer.getLastName();
		customerMap.remove(customerName);
	}
	
	
	public double getCurrencyOfCustomer(String customerName) throws NoCustomerFoundException{
		Customer customer = customerMap.get(customerName);
		if(customer == null){
			throw new NoCustomerFoundException(customerName);
		}
		return customer.getCurrency();
	}
	
	
	

}
