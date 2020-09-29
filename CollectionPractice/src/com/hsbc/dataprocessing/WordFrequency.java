package com.hsbc.dataprocessing;

import java.util.TreeMap;

public class WordFrequency {
	
	static TreeMap<String, Integer> wordCount(String s){
		TreeMap<String, Integer> temp = new TreeMap<>();
		String words[] = s.split(" ");
		for(String word:words) {
			//MERGE FUNCTION
			//:: is used for Method Resolution, NOTE: You canot use ClassName.add though it is static(you don't know what params to pass)
			temp.merge(word, 1, WordFrequency::add);
			
			//TRADITIONAL APPROACH
			//temp.putIfAbsent(word, 0);
			//if(temp.containsKey(word)) {
			//	temp.put(word, temp.get(word)+1);
			//}
		}
		return temp;
	}
	
	static int add(Integer a, Integer b) {
		return a+b;
	}

}
