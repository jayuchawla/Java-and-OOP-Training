package com.hsbc.utilities;

import java.util.List;

public class PrintUtil {

	//List<T> won't be allowed as argument since T is given non-static
	public static void printRecords(List l) {
		System.out.println(l);
	}
}
