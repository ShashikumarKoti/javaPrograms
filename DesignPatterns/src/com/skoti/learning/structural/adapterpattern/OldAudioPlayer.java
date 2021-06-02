package com.skoti.learning.structural.adapterpattern;

public class OldAudioPlayer implements OldMediaPlayer {

	MediaAdapter mediaAdapter;
	
	
	@Override
	public void play(String audioType, String songName) {
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 and song is: "+ songName);
		}else if(audioType.equalsIgnoreCase("mp4")|| audioType.equalsIgnoreCase("vlc")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, songName);
		}else {
			System.out.println("Invalid media type");
		}

	}

}
