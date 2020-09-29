package com.hsbc.filters;

import java.util.Comparator;

import com.hsbc.modelclasses.Book;

/**
 * A utility class to compare 2 Book class object wrt bookName attribute
 * @author Jayprakash Chawla
 *
 */
public class CompareBooksByName implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getBookName().compareTo(o2.getBookName());
	}

}
