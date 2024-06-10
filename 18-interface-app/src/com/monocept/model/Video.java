package com.monocept.model;

public class Video implements Playable {
	private String title;
	private int resolution;
	
	public void play() {
		System.out.println(title+"is playing in :"+resolution+"px");
		
	}
	
	public void pause() {
		System.out.println(title+"is paused in :"+resolution+"px");
		
	}
	
	public void stop() {
		System.out.println(title+"stopped in :"+resolution+"px");
		
	}
	public Video(String title, int resolution) {
		this.title = title;
		this.resolution = resolution;
	}


}
