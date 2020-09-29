package com.hsbc.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class FileReadandCount {
	
	private String fname;
	
	public FileReadandCount(String fname) {
		this.fname = fname;
	}

	public abstract void writeFile();
	
	public String readFile() {
		FileInputStream fis = null;
		StringBuffer sb = null;
		try {
			fis = new FileInputStream("sample.txt");
			sb = new StringBuffer();
			int i = 0;
			try {
				while ((i = fis.read()) != -1) {
					sb.append((char) i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sb.toString();
	}

	public int countWords(String s) {
		String[] words = s.split(" ");
		return words.length;
	}

	public String capitalizeVowels(String s) {
		StringBuffer sb = new StringBuffer(s);
		StringBuffer modifiedString = new StringBuffer();
		
		String temp = "";
		String ch = "";
		
		for(int i = 0;i<sb.length();i++) {
			ch = sb.substring(i,i+1);
			temp = ch.toUpperCase();
			if(temp.equals("A") || temp.equals("E") || temp.equals("I") || temp.equals("O") || temp.equals("U")) {
				modifiedString.append(temp);
			}
			else {
				modifiedString.append(ch);
			}
		}
		//System.out.println(modifiedString.toString());
		return modifiedString.toString();
	}
}
