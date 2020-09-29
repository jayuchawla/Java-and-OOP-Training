package com.hsbc.exceptionhandling;

public class TestAge{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int age = 19;
		if(age>18 && age<55) {
			System.out.println("Admission done");
		}
		else {
			throw new InvalidAgeException();
		}
		RethrowException ewc = new RethrowException();
		
		try {
			ewc.doOperation();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
