package com.designpatterns.behavioral.templatemethod;

public class FriendlyGiftPresenter extends GiftPresenter {
	@Override
	public boolean wantBox() {
		return false;
	}

	@Override
	public boolean wantPackage() {
		return true;
	}

	@Override
	protected void giveGiftToCustomer() {
		System.out.println("Friendly gift is given to customer");

	}

	@Override
	protected void addCard() {
		System.out.println("Card is attached to friendly gift");

	}

	@Override
	protected void boxGif() {

	}

	@Override
	protected void packageGift() {
		System.out.println("Friendly gift is packaged");
	}
}
