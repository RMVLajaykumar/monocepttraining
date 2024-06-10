package com.monocept.model;

public class Audio extends Playable {
	private String title;

	
	public void play() {
		System.out.println(title+" song is playing");
		
	}

	
	public void pause() {
		System.out.println(title+" song paused");
		
	}

	
	public void stop() {
		System.out.println(title+" song stoped");
		
	}


	public Audio(String title) {
		this.title = title;
	}


}
