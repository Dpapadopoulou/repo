package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bookservices {
	
	@Autowired
	AuthorServices authorservices;
	
	@Autowired
	ThemeServices themeservices;
	

	
	public AuthorServices getAuthorservices() {
		return authorservices;
	}

	public void setAuthorservices(AuthorServices authorservices) {
		this.authorservices = authorservices;
	}

	public ThemeServices getThemeservices() {
		return themeservices;
	}

	public void setThemeservices(ThemeServices themeservices) {
		this.themeservices = themeservices;
	}

	private List<Book> books = new ArrayList<Book>();
	


	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Book> addBook(Book book) {
		books.add(book);
		return books;
	}
	
	public List<Book> removeBook(Integer id) {
		books.removeIf(book -> book.getId()==id);
		return books;
	}
	
	public List<Book> updateBook(String newTitle,String newPublisher,String newPublishedYear,Integer id,String newDescription) {
		for (Book book: books) {
			if(book.getId()== id) {
				if(newTitle !=null) 
					book.setTitle(newTitle); 
				
				if(newDescription !=null) 
					book.setDescription(newDescription); 
				
				
			}
		}
		return books;
	
	}	
	
	
	public List<Book> updateAuthorByBook(Integer bookid,Integer authorid) {
		for (Book book: books){   
			if(book.getId()==bookid) {
				for (Author author : authorservices.getAllAuthors()) {
					if(author.getId()==authorid) {
						book.setAuthor(author);
					}
						
				}
		
		}
			
	  }return books; 
     }
	
	
	
	public List<Book> addThemeToBook(Integer bookid,Integer themeid) {
		for (Book book: books){   
			if(book.getId()==bookid) {
				for (Theme theme : themeservices.getThemes()) {
					if(theme.getId()==themeid) {
						themeservices.addTheme(theme);
					}
						
				}
		
		}
			
	  }return books; 
     }

	public void viewAllBooks() {
		if (books.isEmpty()) {
			System.out.println("There are no books.");
			} else {
				System.out.println("Books: ");
				for (Book book : books) {
					System.out.println(book);
					}
				}
	}

	
	
	
	
	
}
