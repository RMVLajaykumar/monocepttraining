package com.monocept.test;

import com.monocept.model.Audio;
import com.monocept.model.Playable;
import com.monocept.model.Video;

public class Playabletest {

	public static void main(String[] args) {
		Playable play;
		play=new Audio("Believer");
		play.play();
		play.pause();
		play.stop();
		play = new Video("RRR",1080);
		play.play();
		play= new Video("RRR",320);
		play.pause();
		play = new Video("RRR",144);
		play.stop();

	}

}
