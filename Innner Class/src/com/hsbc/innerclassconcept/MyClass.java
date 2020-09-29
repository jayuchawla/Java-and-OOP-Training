package com.hsbc.innerclassconcept;

public class MyClass implements MyInterface{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.InnerClass i = new OuterClass.InnerClass();
		System.out.println(i.getVar());
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}


	

	

}
