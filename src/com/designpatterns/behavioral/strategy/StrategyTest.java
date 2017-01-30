package com.designpatterns.behavioral.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		ShoppingCart shoppingCart1 = new ShoppingCart();
		
		Item apple = new Item("Apple", 1);
		Item orange = new Item("Orange", 2);

		shoppingCart1 = new ShoppingCart();
		shoppingCart1.addToCart(apple);
		shoppingCart1.addToCart(orange);

		ShoppingCart shoppingCart2 = new ShoppingCart();
		shoppingCart2.addToCart(apple);
		shoppingCart2.addToCart(orange);
		shoppingCart2.removeFromCart(apple);
		
		shoppingCart1.pay(new CreditCardStrategy("Ali Kemal Tasci", "12341234123412341234", "233", "01/24"));
		shoppingCart2.pay(new PayPalStrategy("ali_kemal_tasci@yahoo.com", "1234"));
		
	}

}
