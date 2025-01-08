package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class AuthorServices {
	
	private List<Author> authors = new ArrayList<Author>();
	
	
	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public void removeAuthor(Author author) {
		authors.remove(author);
	}
	
	public boolean updateAuthor(String newName,String newDescription,Integer id) {
		for (Author author : authors ) {
			if(author.getId()== id) {
				author.setFirstName(newName); 
				author.setDescription(newDescription); 
				
	
			}
			return true;
			
			
		}
		
		return false;
	}
}

}
