package com.cg.corejavalab2;

class Cd extends MediaItem
{
	private String artist,genre;

	public Cd(int Id, String name, int num_copies,int runtime, String artist, String genre) {
		super(Id, runtime, name, num_copies);
		this.artist = artist;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
}
