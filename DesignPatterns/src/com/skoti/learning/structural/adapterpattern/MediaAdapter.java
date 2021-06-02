package com.skoti.learning.structural.adapterpattern;

public class MediaAdapter implements OldMediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	
	public  MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VLCPLayer();
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new MP4Player();
		}
	}

	@Override
	public void play(String audioType, String songName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVLC(songName);
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(songName);
		}
	}
}
