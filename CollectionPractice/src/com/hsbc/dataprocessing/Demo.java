package com.hsbc.dataprocessing;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///LIST
		//ArrayList
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		//al.add(56.6);
		al.add(1);
		
		Collections.sort(al);
		System.out.println("ArrayList"+al);
	
		System.out.println(WordFrequency.wordCount("Hello from the world of games Hello world"));
	}

}
