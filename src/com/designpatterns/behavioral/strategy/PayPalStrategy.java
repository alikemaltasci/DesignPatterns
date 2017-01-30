package com.designpatterns.behavioral.strategy;

public class PayPalStrategy implements PaymentTypeStrategy {

	private String email;
	private String password;

	public PayPalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(Double amount) {
		System.out.println(amount + " is payed using PayPal");

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
