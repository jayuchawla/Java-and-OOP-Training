package com.hsbc.utilities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This is a utility class to store book records
 * 
 * @author Jayprakash Chawla
 *
 * @param <T>
 */
public class StoreUtil<T> {

	private List<T> listOfBooks;

	public StoreUtil() {
		// TODO Auto-generated constructor stub
		this.listOfBooks = new ArrayList<>();
	}

	public void addRecord(T record) {
		this.listOfBooks.add(record);
	}

	public List<T> getRecords() {
		return this.listOfBooks;
	}

	public int getNumOfBooks() {
		return this.listOfBooks.size();
	}
}
