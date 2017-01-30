package com.designpatterns.behavioral.observer;

public class ObserverTest {
	
	public static void main(String[] args){
		BreakingNewsAgency myNewsAgency = new BreakingNewsAgency();
		myNewsAgency.changeLastNews("This is the news number 1");
		
		TvChannel myTvChannel = new TvChannel();
		myNewsAgency.register(myTvChannel);
		
		myNewsAgency.changeLastNews("This is the news number 2");
		
		RadioChannel myRadioChannel = new RadioChannel();
		myNewsAgency.register(myRadioChannel);
		
		myNewsAgency.changeLastNews("This is the news number 3");
		
		myNewsAgency.unregister(myTvChannel);
		
		myNewsAgency.changeLastNews("This is the news number 4");
		
		
	}

}
