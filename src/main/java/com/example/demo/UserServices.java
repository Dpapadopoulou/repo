package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service

public class UserServices {

		
		private List<User> users = new ArrayList<User>();
		
		
		
		public List<User> getAllUsers() {
			return users;
		}



		public List<User> addUser(User user) {
			users.add(user);
			return users;
		}
		
		public List<User> removeUser(String email) {
			users.removeIf(user -> user.getEmail()==email);
			return users;
		}
		
		public List<User> updateUser(String newName,String newSurname,String email) {
			for (User user : users) {
				if(user.getEmail()== email) {
					if(newName !=null) 
						user.setName(newName); 
					
					if(newSurname !=null) 
						user.setSurname(newSurname); 
					
					
				}
			}
			return users;
		}
		
		
		
		
	}	

