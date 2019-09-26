package com.cg.corejavalab2;


class JournalPaper extends WrittenItem
{
	public JournalPaper(int uid, int no_of_copies, String title) {
		super(uid, no_of_copies, title);
		// TODO Auto-generated constructor stub
	}

	private int year_pub;

	public int getYear_pub() {
		return year_pub;
	}

	public void setYear_pub(int year_pub) {
		this.year_pub = year_pub;
	}


} 


