package com.mvc2;

public class Student {

	private int sid;
	private String sname;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	public int getsid() {
		return sid;
	}
	public void setsid(int sid) {
		this.sid = sid;
	}
	public String getsname() {
		return sname;
	}
	public void setsname(String sname) {
		this.sname = sname;
	}
	
	
}
