package com.hsbc.exceptionhandling;

public class RethrowException {
	
	private String s;
	public RethrowException() {
		// TODO Auto-generated constructor stub
		this.s = null;
	}
	public void doOperation() throws Exception{
		try {
			System.out.println(s.length());
		}catch(NullPointerException n){
			System.out.println("I got null value");
			//s = "hello";
			//MAKE AN IMPORTANT NOTE::: if you throw UncheckedExecption 
			//then end user should not be worried of handling that and 
			//hence YOU NEED NOT MENTION THAT WITH THROWS keyword!!!
			//NOTE:: If you throw CHECKED EXCEPTION or JUST EXCEPTION 
			//YOU NEED TO use throws Exception so that user can handle 
			
			//NOW IT DEPENDS ON VALUE OF s:::: hence you also need add throws because you
			//don't know s is null or not
			if (this.s == null) {
				throw new RuntimeException();
			}
			else {
				throw new Exception();
			}
			}
		}	
	}
	
