package com.hsbc.aritmaticutil;

import com.hsbc.exceptions.InvalidOperationException;

public class Evaluator {
	
	private Evaluator() {}
	
	public static double resEval(int option, double... nums) throws InvalidOperationException {		
		
		double res = 0;
		
		switch (option) {
		case 1: {
			for(double e:nums) {
				res+=e;
			}
			break;
		}
		case 2 :{
			for(double e:nums) {
				res-=e;
			}
			break;
		}
		case 3 :{
			res = 1;
			for(double e:nums) {
				res*=e;
			}
			break;
		}
		case 4 :{
			res = 1;
			for(double e:nums) {
				res = e/res;
			}
			break;
		}
		default:
			throw new InvalidOperationException("not a valid operation");
		}
		
		return res;
	}
}
