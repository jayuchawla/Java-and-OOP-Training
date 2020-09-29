package com.hsbc.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "sample.txt";
		
		FileReadWrite frw = new FileReadWrite(fname);
		frw.writeFile();
		String s = frw.readFile();
		System.out.println(s);
		System.out.println(frw.countWords(s));
		
		FileReadWriteUsingCharacterStream frwucs  = new FileReadWriteUsingCharacterStream(fname);
		frwucs.writeFile();
		String s1 = frwucs.readFile();
		System.out.println(s1);
		System.out.println(frwucs.countWords(s1));
		System.out.println(frwucs.capitalizeVowels(s1));
	}

	
}
