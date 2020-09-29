package com.hsbc.utilities;

import java.util.Collections;
import java.util.List;

import com.hsbc.filters.CompareBooksByName;
import com.hsbc.filters.CompareBooksByPrice;
import com.hsbc.modelclasses.Book;

/**
 * A utility class to sort object
 * 
 * @author Jayprakash Chawla
 *
 */
public class SortUtils<T> {

	public static void sortByName(List records) {
		Collections.sort(records, new CompareBooksByName());
		//DO NOT RETURN BECAUSE COLLECTIONS MAKE CHANGE ON THE REFERENCE ITSELF
		//return records;
	}

	public static void sortByPrice(List records) {
		Collections.sort(records, new CompareBooksByPrice());
	}

}
