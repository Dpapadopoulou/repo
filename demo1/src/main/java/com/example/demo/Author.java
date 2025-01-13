package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="author")

public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name= "author_id", nullable=false)
	private Integer id;
	
	@Column(name= "first_name", nullable=false)
	private String firstName;
	
	@Column(name= "last_name", nullable=false)
	private String lastName;
	
	@Column(name= "date_of_birth", nullable=true)
	private String dateOfBirth;
	
	public Author(Integer id,String firstName,String lastName,String dateOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getId() {
		return id;
	}
	
	

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	//ToString
			@Override
			public String toString() {
				return "Author [ id: " + id + ", FirstName: " + firstName + ", LastName: " + lastName + ", Date of Birth: " + dateOfBirth +"]" ;
			}
	
}
