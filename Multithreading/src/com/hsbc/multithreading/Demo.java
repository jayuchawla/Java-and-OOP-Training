package com.hsbc.multithreading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThreadClass t1 = new FirstThreadClass();
		SecondThreadClass t2 = new SecondThreadClass();
		t1.start();
		t2.start();
	}

}
