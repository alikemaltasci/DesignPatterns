package com.designpatterns.behavioral.templatemethod;

public class TemplateMethodTest {

	public static void main(String[] args) {
		GiftPresenter corporate = new CorporateGiftPresenter();
		GiftPresenter friendly = new FriendlyGiftPresenter();
		
		corporate.sellGift();
		friendly.sellGift();

	}

}
