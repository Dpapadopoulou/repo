package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ThemeServices {

	
	@Autowired ThemeRepository repository;
	
	
	
	public List<Theme> getThemes() {
		return repository.findAll();
	}


	public List<Theme> removeTheme(Integer id) {
		repository.deleteById(id);
		return this.getThemes();
		
	}
	
	
	public List<Theme> addTheme(Theme theme) {
		repository.save(theme);
		return this.getThemes();
	}
	
	
	public List<Theme> updateTheme(String newName,String newDescription,Integer id) {
		for (Theme theme1 : getThemes()) {
			if(theme1.getId()== id) {
				if(newName !=null) 
					theme1.setName(newName); 
				
				if(newDescription !=null) 
					theme1.setDescription(newDescription); 
				
				
			}
		}
		return this.getThemes();
	
	}

	
	

	
	
}		
				
	
		
