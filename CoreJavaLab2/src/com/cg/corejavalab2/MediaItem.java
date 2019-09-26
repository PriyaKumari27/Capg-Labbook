package com.cg.corejavalab2;


abstract class MediaItem extends Item
{
	private int runtime;

	public MediaItem(int uid, int no_of_copies, String title, int runtime) {
		super(uid, no_of_copies, title);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}




}
