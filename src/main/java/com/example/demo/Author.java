package com.example.demo;

public class Author {
	
	private Integer id;
	private String firstName;
	private String lastName;
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
