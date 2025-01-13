package com.example.demo;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		
		
//		
//		ThemeServices themeServices = new ThemeServices();
//		AuthorServices authorServices = new AuthorServices();
//		Bookservices bookServices = new Bookservices();
//		
//		themeServices.addTheme(new Theme(4, "Fantasy", "Vampires and Werewolves"));
//		
//		themeServices.addTheme(new Theme(1, "Sci-Fi", "Science Fiction"));
//		themeServices.addTheme(new Theme(2, "Romance", "Love"));
//		themeServices.addTheme(new Theme(3, "Comedy", "Hahaha"));
//		
//		Author author1 = new Author(1,"Ioanna","Markou", "7 Feb");
//		authorServices.addAuthor(author1);
//		authorServices.addAuthor(new Author(2,"Despoina","Papadopoulou", "20 Feb"));
//		authorServices.addAuthor(new Author(3,"Thodoris","Maikantis", "19 Dec"));
//		
//		
//		
//		bookServices.addBooks(new Book(1,"Twilight"," ", "2017", "Edward and Bella Meet",author1,  new ArrayList<Theme>()));
//		bookServices.addBooks(new Book(2,"Twilight: New Moon", " ", "2018", "Edward and Bella Break Up", author1,  new ArrayList<Theme>()));
//		bookServices.addBooks(new Book(3,"Twilight: Eclipse", " ", "2019", "Edward and Bella Get Back Together", author1,  new ArrayList<Theme>()));
//		bookServices.addBooks(new Book(4,"Twilight: Breaking Dawn", " ", "2020", "Edward and Bella Get Married and Have a Baby", author1,  new ArrayList<Theme>()));
//		
//		
//		themeServices.getThemes().forEach(x -> System.out.println(x.toString()));
//		
//		System.out.println("-----------------------------------------");
//		bookServices.viewAllBooks();
//		
//
//		System.out.println("-----------------------------------------");	
//		
//		bookServices.updateBook("Twilight: Breaking Dawn Part 1",null,"2015",4,null);		
//		bookServices.viewAllBooks();
//
//		System.out.println("-----------------------------------------");
//		
//	
//		bookServices.viewAllBooks();
//		
//		
//		System.out.println("-----------------------------------------");
//		bookServices.viewAllBooks();
//		
//		
//		System.out.println("-----------------------------------------");
//		Theme theme5  = new Theme(5, "Horror", "So scary");
//		themeServices.addTheme(theme5);
//		bookServices.viewAllBooks();
		
		
	}
	

}