package com.hsbc.stringmethods;

public class CountOccurences {
	
	private String s;
	
	public CountOccurences(String s) {
		this.s = s;
	}
	
	public int findInArr(String arr[], String word) {
		int count = 0;
		for (int i = 0; i < arr.length; i++)  
	    { 
	    // if match found increase count 
	    if (word.equals(arr[i])) 
	        count++; 
	    } 
		return count;
	}
	
	public void getOccurences() {
		String[] words = this.s.split(" ");
		for(String item: words) {
			System.out.println(item+":"+this.findInArr(words, item));
		}
	}

}
