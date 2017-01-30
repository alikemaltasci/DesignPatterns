package com.designpatterns.behavioral.observer;

public class RadioChannel implements Observer {
	
	private String breakingNews;

	@Override
	public void update(String breakingNews) {
		this.breakingNews = breakingNews;
		System.out.println("Breaking News on Radio Channel: " + this.breakingNews);
	}	

}
