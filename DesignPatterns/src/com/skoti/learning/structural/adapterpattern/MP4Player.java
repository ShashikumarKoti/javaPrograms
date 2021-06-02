package com.skoti.learning.structural.adapterpattern;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String songName) {
		//do Nothing
	}

	@Override
	public void playMp4(String songName) {
		System.out.println("Playing with MP4 type and song is: "+ songName);
	}
}
