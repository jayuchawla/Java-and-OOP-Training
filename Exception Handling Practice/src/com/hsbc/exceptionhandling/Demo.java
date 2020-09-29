package com.hsbc.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.SQLException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		int a[] = {1,2,3,4,5};
		d.getArrayElement(a, a.length);
		
		//SINCE YOU POSTPONE CHECKED EXCEPTION in SCANF you need to handle it now!!! 
		try {
			System.out.println(d.scanf());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//You do not want to hold exception in current method
	//User or caller of this method should compulsorily know to handle IOException, SQLException
	//Now these 2 exceptions are Checked ones and compiler will check if you handled them
	//Hence we postpone it to user to handle thses exceptions when using the below function
	public String scanf() throws IOException, SQLException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string");
		String s = null;
		//If you do not postpone i.e do not mention throws, you have to put below statement in try catch
		s = br.readLine();
		return s;		
	}
	
	public void divide() {
		int a,b,c;
		a = 10;
		b = 0;
		c = 0;
		String s = null;
		try {
			c = a/b;
			System.out.println(s.length());
		}catch (ArithmeticException a1) {
			System.out.println("Divide by 0");
			System.out.println(a1);
		}catch (NullPointerException n1) {
			System.out.println("Null String");
			System.out.println(n1);
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}finally {
			System.out.println("I will for sure execute!");
		}
	}
	
	public int getArrayElement(int[] a, int index) {
		try {
			return a[index];
		}catch(ArrayIndexOutOfBoundsException aioob) {
			System.out.println(aioob);
			System.out.println("Cannot access passed index");
			return -1;
		}finally {
			System.out.println("I will for sure execute!");
		}
		
	}
	
}
