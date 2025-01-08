package com.example.demo;

public class Book {
	
	private Integer id;
	private String title;
	private String publisher;
	private String publisheYear;
	private String description;
	private Author author;
	private Theme theme;
	
	public Book(Integer id,String title,String publisher,String publishYear,String description) {
		
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.publisheYear = publishYear;
		this.description = description;
		
		
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
		return publisheYear;
	}
	public void setPublisheYear(String publisheYear) {
		this.publisheYear = publisheYear;
	}
	
	public Theme getTheme() {
		return theme;
	}
	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
