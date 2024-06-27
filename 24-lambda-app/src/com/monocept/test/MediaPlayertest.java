package com.monocept.test;

import com.monocept.model.AudioPlayer;
import com.monocept.model.MediaPlayer;
import com.monocept.model.PodcastPlayer;
import com.monocept.model.VideoPlayer;

public class MediaPlayertest {

	public static void main(String[] args) {
		MediaPlayer mediaPlayer=new AudioPlayer();
		MediaPlayer.supportedfiles();
		mediaPlayer.start();
		mediaPlayer.stop();
		System.out.println();
		mediaPlayer=new VideoPlayer();
		MediaPlayer.supportedfiles();
		mediaPlayer.start();
		mediaPlayer.stop();
		System.out.println();
		mediaPlayer=new PodcastPlayer();
		MediaPlayer.supportedfiles();
		mediaPlayer.start();
		mediaPlayer.stop();
	}

}