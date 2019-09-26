package com.cg.corejavalab2;

class Video extends MediaItem
{
	public Video(int uid, int no_of_copies, String title, int runtime) {
		super(uid, no_of_copies, title, runtime);
		// TODO Auto-generated constructor stub
	}
	private String director,genre;
	private int year_rel;


	public Video(int uid, int no_of_copies, String title, int runtime, String director, String genre, int year_rel) {
		super(uid, no_of_copies, title, runtime);
		this.director = director;
		this.genre = genre;
		this.year_rel = year_rel;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear_rel() {
		return year_rel;
	}
	public void setYear_rel(int year_rel) {
		this.year_rel = year_rel;
	}




}
