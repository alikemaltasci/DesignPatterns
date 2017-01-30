package com.designpatterns.structural.proxy;

public class ProxyTest {
	
	public static void main(String[] args){
		
		ProxyBankAccount bankAccount = new ProxyBankAccount();
		try {
			System.out.println(bankAccount.getCurrencyOfCustomer("Ali Kemal Tasci"));
			System.out.println(bankAccount.getCurrencyOfCustomer("Ertugrul Tasci"));
			System.out.println(bankAccount.getCurrencyOfCustomer("Omer Semih Tasci"));
			System.out.println(bankAccount.getCurrencyOfCustomer("Sema Tasci"));
		} catch (NoCustomerFoundException e) {
			e.printStackTrace();
		}
		
	}

}
