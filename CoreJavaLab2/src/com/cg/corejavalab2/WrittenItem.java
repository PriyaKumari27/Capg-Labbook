package com.cg.corejavalab2;


abstract class WrittenItem extends Item
{
	private String auth_name,auth_place;
	private int auth_exp;

	public WrittenItem(int uid, int no_of_copies, String title) {
		super(uid, no_of_copies, title);
		// TODO Auto-generated constructor stub
	}


	public WrittenItem(int uid, int no_of_copies, String title, String auth_name, String auth_place, int auth_exp) {
		super(uid, no_of_copies, title);
		this.auth_name = auth_name;
		this.auth_place = auth_place;
		this.auth_exp = auth_exp;
	}


	public void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}


	public void setAuth_place(String auth_place) {
		this.auth_place = auth_place;
	}


	public void setAuth_exp(int auth_exp) {
		this.auth_exp = auth_exp;
	}


	public String getAuth_name() {
		return auth_name;
	}


	public String getAuth_place() {
		return auth_place;
	}


	public int getAuth_exp() {
		return auth_exp;
	}


}



