package com.designpatterns.behavioral.state;

public class PlayingState implements MusicPlayerState {
	
	MusicPlayer player;
	
	public PlayingState(MusicPlayer player) {
		this.player = player;
	}

	@Override
	public void pushPlayButton() {
		System.out.println("Player stopped");
		player.setState(player.getStoppedState());

	}

}
