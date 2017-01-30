package com.designpatterns.structural.proxy;

public class ProxyBankAccount implements BankAccount {
	
	private BankAccount realBankAccount;
	
	public ProxyBankAccount() {
		if(realBankAccount == null){
			realBankAccount = new RealBankAccount();
		}
	}

	@Override
	public double getCurrencyOfCustomer(String customerName) throws NoCustomerFoundException {
		return realBankAccount.getCurrencyOfCustomer(customerName);
	}

}
