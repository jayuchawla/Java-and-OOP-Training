package com.hsbc.stringmethods;

public class ReplaceFirstChar {
	
	private String s;
	public ReplaceFirstChar(String s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}
	
	public String getReplaced() {
		String temp = s.substring(0,1).toUpperCase();
		return temp+s.substring(1);
	}
}
