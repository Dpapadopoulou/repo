package com.example.demo;

public class Borrow {
	
	private Integer id;
	private Book book;
	private User user;
	private String startDate;
	private String endDate;
	
	



	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}



	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}




	@Override
	public String toString() {
		return "Borrow [id=" + id + ", book=" + book + ", user=" + user + ", StartDate=" + startDate + "EndDate= "
	+ endDate + "]";
	}
	
	
	
	
	

}
