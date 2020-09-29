package com.hsbc.stringmethods;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = "hello world hello hello world welcome to India";
		String s = "hello world welcome to India";
		
		//NOTE::: Strings are immutable
		//"Hello World:::" is stored in String Literal Pool benefits are reuasbilty, no new object created instead same string referred
		//When I create using new :::: blindly java creates a new object in Heap
		String t1 = new String("Hello World:::");
		String s1 = new String("Hello World:::");
		
		//1
		//NOTE:: String class overrides toString() method of Object to return the value "Hello"
		System.out.println(t);

		//2
		System.out.println(t.length());
		
		//3
		System.out.println(t.charAt(t.length()-1));
		
		//4
		System.out.println(t.replace("o", "#"));
		
		//5
		System.out.println(t.replaceFirst("o", "#"));
		
		//6
		System.out.println(t.toUpperCase());
		
		//7
		System.out.println(t.equals(s));
		System.out.println(t1.equals(s1));
		
		//8
		ReverseString rs = new ReverseString("Hello World");
		System.out.println(rs.getReverse());
		
		//9
		ReplaceFirstChar rfc = new ReplaceFirstChar("hello World");
		System.out.println(rfc.getReplaced());
		
		//10
		String arr[] = s.split(" ");
		for (String item: arr) {
			ReplaceFirstChar temp = new ReplaceFirstChar(item);
			System.out.println(temp.getReplaced());
		}
		
		//11
		CountOccurences co = new CountOccurences(t);
		co.getOccurences();
		
	}

}
