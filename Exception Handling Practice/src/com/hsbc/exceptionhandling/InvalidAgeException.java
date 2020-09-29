package com.hsbc.exceptionhandling;

public class InvalidAgeException extends RuntimeException{
	public InvalidAgeException() {
		// TODO Auto-generated constructor stub
		super("Age Limit is between 18 and 35!");
	}
}
