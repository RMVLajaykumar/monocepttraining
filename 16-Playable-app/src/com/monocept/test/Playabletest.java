package com.monocept.test;

import com.monocept.model.Audio;
import com.monocept.model.Video;

public class Playabletest {

	public static void main(String[] args) {
		Audio song=new Audio("Believer");
		song.play();
		song.pause();
		song.stop();
		
		Video screen = new Video("RRR",1080);
		screen.play();
		Video screen1= new Video("RRR",320);
		screen1.pause();
		Video screen3 = new Video("RRR",144);
		screen3.stop();

	}

}
