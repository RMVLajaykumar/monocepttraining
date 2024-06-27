package com.monocept.model;

public interface MediaPlayer {

		void start();
		default void stop() {
			System.out.println("Media is stoped");
		}
		static void supportedfiles() {
			System.out.println("supported file : mp3, mp4");
		}


}
