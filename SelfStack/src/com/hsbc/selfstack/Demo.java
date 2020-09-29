package com.hsbc.selfstack;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NOTE: We can only use wrapper classes in generics
		
		SelfStack<Integer> ss = new SelfStack<>();
		ss.push(45);
		ss.push(34);
		ss.printStack();
	}

}
