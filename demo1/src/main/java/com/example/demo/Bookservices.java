package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Bookservices {
	
	
	private List<Book> books = new ArrayList<Book>();
	
	public void addBooks(Book book) {
		books.add(book);
	
	}
	
	public void removeBooks(Book book) {
		books.remove(book);
	
	}
	
	
}
