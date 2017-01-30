package com.designpatterns.behavioral.observer;

public class TvChannel implements Observer {

	private String breakingNews;
	
	@Override
	public void update(String breakingNews) {
		this.breakingNews = breakingNews;
		System.out.println("Breaking News on Tv Channel: " + this.breakingNews);
	}

}
