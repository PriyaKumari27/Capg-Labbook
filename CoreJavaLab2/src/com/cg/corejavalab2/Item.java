package com.cg.corejavalab2;


public abstract class Item {

	private int uid,no_of_copies;
	private String title;
	public Item(int uid, int no_of_copies, String title) {
		super();
		this.uid = uid;
		this.no_of_copies = no_of_copies;
		this.title = title;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getNo_of_copies() {
		return no_of_copies;
	}
	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Item [uid=" + uid + ", no_of_copies=" + no_of_copies + ", title=" + title + "]";
	}

}



