package com.hsbc.filters;

import java.util.Comparator;

import com.hsbc.modelclasses.Book;

/**
 * A utility class to compare 2 Book class object wrt bookPrice attribute
 * @author Jayprakash Chawla
 *
 */
public class CompareBooksByPrice implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		int p1 = o1.getBookPrice();
		int p2 = o2.getBookPrice();
		if (p1 == p2) {
			return 0;
		}
		else {
			return (p1 > p2 ? 1 : -1);
		}
	}

}
