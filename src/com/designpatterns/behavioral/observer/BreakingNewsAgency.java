package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BreakingNewsAgency implements Subject{
	
	private String breakingNews;
	private List<Observer> channelList;
	
	public BreakingNewsAgency() {
		channelList = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		channelList.add(observer);		
	}

	@Override
	public void unregister(Observer observer) {
		channelList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer channel: channelList){
			channel.update(this.breakingNews);
		}
	}	
	
	public void changeLastNews(String lastNews){
		this.breakingNews = lastNews;
		notifyObservers();
	}
}
