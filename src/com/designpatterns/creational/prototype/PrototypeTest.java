package com.designpatterns.creational.prototype;

public class PrototypeTest {
	
	public static void main(String[] args){
		Customer customer = new Customer();
		customer.setName("Ali Kemal");
		customer.setSurname("Tasci");
		customer.setAge(34);
		
		System.out.println("Customer is " + customer + " " +  System.identityHashCode(customer));
		
		Customer clonedCustomer = (Customer) customer.clone();
		System.out.println("Cloned Customer is " + clonedCustomer + " " +  System.identityHashCode(clonedCustomer));
		
	}

}
