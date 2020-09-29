package com.hsbc.uipackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.hsbc.modelclasses.Book;
import com.hsbc.utilities.PrintUtil;
import com.hsbc.utilities.SortUtils;
import com.hsbc.utilities.StoreUtil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> books = new ArrayList<Book>();
		HashSet<String> authors1 = new HashSet<String>();
		HashSet<String> authors2 = new HashSet<String>();
		HashSet<String> authors3 = new HashSet<String>();
		HashSet<String> authors4 = new HashSet<String>();
		authors1.add("X");
		authors2.add("Y");
		authors3.add("Z");
		authors3.add("P");
		authors4.add("M");
		authors4.add("M");
		
		
		books.add(new Book(1, "z",authors1, 300));
		books.add(new Book(2, "y",authors2, 4));
		books.add(new Book(3, "p",authors3, 50));
		books.add(new Book(4, "a",authors4, 1));
		
		//Storing records one by one using StoreUtil class object
		StoreUtil<Book> su = new StoreUtil<Book>();
		for(Book b: books) {
			su.addRecord(b);
		}
		
		System.out.println(su.getNumOfBooks());
		
		//GET RECORDS
		List<Book> records = su.getRecords();
		PrintUtil.printRecords(records);
		
		//COMPARE AND PRINT BOOKS WRT NAME
		SortUtils.sortByName(records);
		PrintUtil.printRecords(su.getRecords());
		
		//COMPARE BOOKS WRT PRICE
		SortUtils.sortByPrice(records);
		PrintUtil.printRecords(su.getRecords());
		
	}

}
