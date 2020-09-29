package com.hsbc.mathutil;

public class Factorial {

	private Factorial() {
	}

	public final static long getFactorial(int n) {
		long fact = 1;
		int temp = n;
		while (temp > 1) {
			fact *= temp;
			temp--;
		}
		return fact;
	}
}
