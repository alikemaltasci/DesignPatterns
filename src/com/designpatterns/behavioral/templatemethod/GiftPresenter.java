package com.designpatterns.behavioral.templatemethod;

public abstract class GiftPresenter {

	final public void sellGift() {

		if (wantBox()) {
			boxGif();
		}

		if (wantPackage()) {
			packageGift();
		}

		if (wantCard()) {
			addCard();
		}

		giveGiftToCustomer();

	}

	protected abstract void giveGiftToCustomer();
	protected abstract void addCard();
	protected abstract void packageGift();
	protected abstract void boxGif();

	private boolean wantCard() {
		return true;
	}

	public boolean wantPackage() {
		return true;
	}

	public boolean wantBox() {
		return false;
	}
}
