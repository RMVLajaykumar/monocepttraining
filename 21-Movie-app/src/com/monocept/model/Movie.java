package com.monocept.model;

import java.io.Serializable;

public class Movie implements Serializable {
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	private int movieid;
	private String name;
	private String genre;
	private int year;
	public Movie(int movieid, String name, String genre, int year) {
		super();
		this.movieid = movieid;
		this.name = name;
		this.genre = genre;
		this.year = year;
	}
	public Movie() {
		
	}

}
