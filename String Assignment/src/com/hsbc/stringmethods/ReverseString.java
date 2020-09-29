package com.hsbc.stringmethods;

public class ReverseString {
	
	private String s;
	public ReverseString(String s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}
	
	public String getReverse() {
		String temp ="";
		for(int i = (this.s.length()-1); i>=0; i--) {
			temp+=this.s.charAt(i);
		}
		return temp;
	}

}
