package com.kh.model.vo;

public class Music {
	private int musicNo;
	private String musicTitle;
	private String musician;
	private String genre;
	private int playNo;
	
	
	public Music() {
		super();
	}


	public Music(int musicNo, String musicTitle, String musician, String genre) {
		super();
		this.musicNo = musicNo;
		this.musicTitle = musicTitle;
		this.musician = musician;
		this.genre = genre;
	}


	public int getMusicNo() {
		return musicNo;
	}


	public void setMusicNo(int musicNo) {
		this.musicNo = musicNo;
	}


	public String getMusicTitle() {
		return musicTitle;
	}


	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}


	public String getMusician() {
		return musician;
	}


	public void setMusician(String musician) {
		this.musician = musician;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
		return  musicNo + ", " + musicTitle + ", " + musician + ", " + genre;
	}
	
	
	
	
}
