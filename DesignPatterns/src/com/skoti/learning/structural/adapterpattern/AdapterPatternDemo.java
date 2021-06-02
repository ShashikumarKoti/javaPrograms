package com.skoti.learning.structural.adapterpattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {

		OldAudioPlayer oap = new OldAudioPlayer();

		oap.play("mp3", "zara zara.mp3");
		oap.play("vlc", "vaaranam aayiram.vlc");
		oap.play("mp4", "see you again.mp4");
		oap.play("avk", "tagaru bantu tagaru.avk");
	}
}
