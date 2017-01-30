package com.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Item> items;
	
	
	public ShoppingCart(){
		this.items = new ArrayList<Item>();
	}
	
	public void addToCart(Item item){
		this.items.add(item);		
	}
	
	public void removeFromCart(Item item){
		this.items.remove(item);
	}
	
	public double calculateTotal(){
		double total = 0;
		for(Item item: items){
			total += item.getPrice();
		}
		return total;
	}
	
	public void pay(PaymentTypeStrategy paymentTypeStrategy){
		double amount = calculateTotal();
		paymentTypeStrategy.pay(amount);
	}

}
