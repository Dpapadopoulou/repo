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
@RequestMapping("themes") // monopati tou controller
public class BookController {
	
	@Autowired
	Bookservices Bookservices;
	

	@GetMapping("/allbooks")
	public List<Book> getAllBooks(){
		return Bookservices.getBooks();	
	}
	
	

	@PostMapping("/add")
	public List<Book> addBook(@RequestBody Book book){
		return Bookservices.addBook(book);
	}
	
	@DeleteMapping("/delete")
	public List<Book> deleteBook(@RequestParam Integer id){
		return Bookservices.removeBook(id);
	}
	
	@PutMapping("/update")
	public List<Book> updateBook(@RequestParam (required = false) String newTitle,@RequestParam (required = false) String newPublisher, @RequestParam (required = false)String newPublishedYear,Integer id, @RequestParam (required = false)String newDescription){
		return Bookservices.updateBook(newTitle,newPublisher, newPublishedYear, id, newDescription);
	}
	
	
	@PutMapping("/updateAuthorByBook")
	public List<Book> updateAythorByBook(@RequestParam Integer bookid,@RequestParam Integer authorid){
		return Bookservices.updateAuthorByBook( bookid,authorid);
	}
	
	
	
	@PostMapping("/addThemeToBook")
	public List<Book> addTheToBook(@RequestParam Integer bookid,@RequestParam Integer themeid){
		return Bookservices.addThemeToBook(bookid,themeid);
	}
	
	
	
}
