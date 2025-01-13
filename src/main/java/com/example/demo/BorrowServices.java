package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BorrowServices {


	
	@Autowired
	UserServices authorservices;
	
	@Autowired
	ThemeServices themeservices;
	
	
	@Autowired
	Bookservices bookservices;
	
	
	
	
	public UserServices getAuthorservices() {
		return authorservices;
	}

	public void setAuthorservices(UserServices authorservices) {
		this.authorservices = authorservices;
	}

	public ThemeServices getThemeservices() {
		return themeservices;
	}

	public void setThemeservices(ThemeServices themeservices) {
		this.themeservices = themeservices;
	}


	private List<Borrow> borrows = new ArrayList<Borrow>();
	
	
	
	
	public List<Borrow> getBorrows() {
		return borrows;
	}

	public void setBorrows(List<Borrow> borrows) {
		this.borrows = borrows;
	}
	
	
	public List<Borrow> makeBorrowing(Integer borrowid, String borrowStartDate, String borrowEndDate, Integer bookid , Integer userid) {
	    
	    return borrows; 
	}
 
	
	
		
	
}	
	
	
	
	
	
