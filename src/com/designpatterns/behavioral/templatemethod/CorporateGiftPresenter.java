package com.designpatterns.behavioral.templatemethod;

public class CorporateGiftPresenter extends GiftPresenter{
	
	@Override
	public boolean wantBox() {
		return true;
	}
	
	@Override
	public boolean wantPackage() {
		return false;
	}

	@Override
	protected void giveGiftToCustomer() {
		System.out.println("Corporate gift is given to customer");
		
	}

	@Override
	protected void addCard() {
		System.out.println("Card is attached to corporate gift");
		
	}


	@Override
	protected void boxGif() {
		System.out.println("Corporate gift is boxed");
		
	}

	@Override
	protected void packageGift() {
		
		
	}
	
	

}
