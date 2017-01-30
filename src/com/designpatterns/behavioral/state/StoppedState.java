package com.designpatterns.behavioral.state;

public class StoppedState implements MusicPlayerState {

	MusicPlayer player;
	
	public StoppedState(MusicPlayer player) {
		this.player = player;
	}
	
	@Override
	public void pushPlayButton() {
		System.out.println("Player started");
		player.setState(player.getPlayingState());

	}

}
