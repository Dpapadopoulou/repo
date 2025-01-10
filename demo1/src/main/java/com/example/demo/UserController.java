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
public class UserController {
	
	@Autowired
	UserServices userServices;
	

	@GetMapping("/allusers")
	public List<User> getAllUsers(){
		return userServices.getAllUsers();	
	}
	
	

	@PostMapping("/add")
	public List<User> addUser(@RequestBody User user){
		return userServices.addUser(user);
	}
	
	@DeleteMapping("/delete")
	public List<User> deleteUser(@RequestParam String email){
		return userServices.removeUser(email);
	}
	
	@PutMapping("/update")
	public List<User> updateUser(@RequestParam (required = false) String newName,@RequestParam (required = false) String newSurname,@RequestParam (required = false) String email){
		return userServices.updateUser(newName,newSurname,email);
	}
	
	
	
}
