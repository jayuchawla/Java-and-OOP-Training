package com.hsbc.modelclasses;

import java.util.Set;

/**
 * This class is a model class representing Book
 * 
 * @author Jayprakash Chawla
 *
 */
public class Book {

	private int bookId;
	private String bookName;
	private Set<String> authors;
	private int bookPrice;

	public Book(int bookId, String bookName, Set<String> authors, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authors = authors;
		this.bookPrice = bookPrice;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Set<String> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<String> authors) {
		this.authors = authors;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authors=" + authors + ", bookPrice=" + bookPrice
				+ "]";
	}
	
	
}
