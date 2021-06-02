package com.skoti.learning.structural.adapterpattern;

public class VLCPLayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String songName) {
		System.out.println("Playing with VLC type and song is: "+ songName);
	}

	@Override
	public void playMp4(String songName) {
		//do Nothing
	}
}
