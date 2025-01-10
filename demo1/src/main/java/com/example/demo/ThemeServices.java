package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ThemeServices {

	private List<Theme> themes = new ArrayList<Theme>();
	
	
	
	public List<Theme> getThemes() {
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}

	public List<Theme> removeTheme(Integer id) {
		themes.removeIf(theme -> theme.getId()==id);
		return themes;
	}
	
	
	public List<Theme> addTheme(Theme theme) {
          themes.add(theme);
          return themes;
	}
	
	
	public List<Theme> updateTheme(String newName,String newDescription,Integer id) {
		for (Theme theme1 : themes) {
			if(theme1.getId()== id) {
				if(newName !=null) 
					theme1.setName(newName); 
				
				if(newDescription !=null) 
					theme1.setDescription(newDescription); 
				
				
			}
		}
		return themes;
	
	}

	
	

	
	
}		
				
	
		
