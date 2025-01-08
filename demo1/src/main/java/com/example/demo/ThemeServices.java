package com.example.demo;

import java.util.List;
import java.util.ArrayList;


public class ThemeServices {

	private List<Theme> themes = new ArrayList<Theme>();
	
	
	
	public List<Theme> getThemes() {
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}

	public void removeTheme(Theme theme) {
		themes.remove(theme);
	}
	
	
	public void addTheme(Theme theme) {
		themes.add(theme);
	}
	
	
	public boolean updateTheme(Theme theme,String newName,String newDescription,Integer id) {
		for (Theme theme1 : themes) {
			if(theme1.getId()== id) {
				theme1.setName(newName); 
				theme1.setDescription(newDescription); 
				
	
			}
			return true;
			
			
		}
		
		return false;
	}
}
