package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class AuthorServices {
	
	private List<Author> authors = new ArrayList<Author>();
	
	
	
	public  List<Author> getAllAuthors() {
		return authors;
	}



	public List<Author> addAuthor(Author author) {
		authors.add(author);
		return authors;
	}
	
	public List<Author> removeAuthor(Integer id) {
		authors.removeIf(author -> author.getId()==id);
		return authors;
	}
	
	public List<Author> updateAuthor(String newFirstName,String newLastName,Integer id,String newDateOfBirth) {
		for (Author author : authors) {
			if(author.getId()== id) {
				if(newFirstName !=null) 
					author.setFirstName(newFirstName); 
				
				if(newLastName !=null) 
					author.setLastName(newLastName); 
				
				if(newDateOfBirth !=null) 
					author.setDateOfBirth(newDateOfBirth);
				
				
			}
		}
		return authors;
	}
	
	
	
	
	
}	