package com.example.demo;

import java.util.ArrayList;

public class Book {
	
	private Integer id;
	private String title;
	private String publisher;
	private String publishedYear;
	private String description;
	private Author author;
	private ArrayList<Theme> theme;
	private boolean borrowed;
	




	public Book(int id, String title, String publisher, String publishYear, String description, Author author,
			ArrayList<Theme> arrayList) {
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.publishedYear = publishYear;
		this.description = description;
		this.author = author;
		this.theme = arrayList;
	}




	public boolean isBorrowed() {
		return borrowed;
	}




	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}




	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisheYear() {
		return publishedYear;
	}
	public void setPublisheYear(String publisheYear) {
		this.publishedYear = publisheYear;
	}
	
	
	public String getPublishedYear() {
		return publishedYear;
	}



	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}



	public ArrayList<Theme> getTheme() {
		return theme;
	}



	public void setTheme(ArrayList<Theme> theme) {
		this.theme = theme;
	}



	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	//ToString
			@Override
			public String toString() {
				return "Book [id=" + id + ", title=" + title + ", publisher=" + publisher + ", publishedYear="
						+ publishedYear + ", description=" + description + ", author=" + author + ", theme=" + theme
						+ "]";
			}
	
	
}
