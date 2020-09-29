package com.hsbc.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteUsingCharacterStream extends FileReadandCount{

	public FileReadWriteUsingCharacterStream(String fname) {
		super(fname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeFile() {

		//to write using Character stream
		FileWriter fw = null;

		// why FileOutputStream has to be enclosed in FileNotFoundException when it
		// creates when not exists?
		// FileNotFoundException is also raised when path provided cannot be used to
		// make new file due to security
		try {
			fw = new FileWriter("sample.txt");
			String s = "Hello world welcome to the fun";
			
			//writing CHARACTER STREAM
			fw.write(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException i) {
			i.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException i) {
				// TODO Auto-generated catch block
				// WHY IO EXCEPTION ? in case you fos is null
				// why not NPE?? since nullptrexception is runtime and io is compile time hence
				// need to be handled first
				i.printStackTrace();
			}
		}
	}

}
