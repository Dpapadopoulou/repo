package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("authors") // monopati tou controller
public class AuthorController {
	
	@Autowired
	AuthorServices authorServices;
	
	
	@GetMapping("/allauthors")
	public List<Author> getAllAuthors(){
		return authorServices.getAllAuthors();	
	}
	
	

	@PostMapping("/add")
	public List<Author> addAuthor(@RequestBody Author author){
		return authorServices.addAuthor(author);
	}
	
	@DeleteMapping("/delete")
	public List<Author> deleteAuthor(@RequestParam Integer id){
		return authorServices.removeAuthor(id);
	}
	
	@PutMapping("/update")
	public List<Author> updateAuthor(@RequestParam (required = false) String newFirstName, @RequestParam (required = false) String newLastName,@RequestParam Integer id,@RequestParam (required = false) String newDateOfBirth){
		return authorServices.updateAuthor(newFirstName,newLastName, id,newDateOfBirth);
	}
}
