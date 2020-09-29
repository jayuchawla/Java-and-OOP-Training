package com.hsbc.innerclassconcept;

public class OuterClass implements MyInterface{
	
	static class InnerClass{
		private int sampleVar;
		
		public InnerClass() {
			// TODO Auto-generated constructor stub
		System.out.println("Inner Class in MyClas1");
		}
		
		public int getVar() {
			return this.sampleVar;
		}
	}
	
	@Override
	public int add(int a, int b) {
		
		Integer i = 9;
		// TODO Auto-generated method stub
		return a*b;}
}
