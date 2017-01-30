package com.designpatterns.behavioral.state;

public class MusicPlayer implements MusicPlayerState {

	private MusicPlayerState currentState;

	private MusicPlayerState playingState;
	private MusicPlayerState stoppedState;

	public MusicPlayer() {
		playingState = new PlayingState(this);
		stoppedState = new StoppedState(this);
		currentState = stoppedState;

	}

	public void setState(MusicPlayerState currentState) {
		this.currentState = currentState;
	}

	public MusicPlayerState getPlayingState() {
		return playingState;
	}

	public MusicPlayerState getStoppedState() {
		return stoppedState;
	}

	@Override
	public void pushPlayButton() {
		currentState.pushPlayButton();

	}

}
