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
public class ThemeController {
	
	@Autowired
	ThemeServices themeServices;
	

	@GetMapping("/allthemes")
	public List<Theme> getThemesAll(){
		return themeServices.getThemes();	
	}
	
	

	@PostMapping("/add")
	public List<Theme> addTheme(@RequestBody Theme theme){
		return themeServices.addTheme(theme);
	}
	
	@DeleteMapping("/delete")
	public List<Theme> deleteTheme(@RequestParam Integer id){
		return themeServices.removeTheme(id);
	}
	
	@PutMapping("/update")
	public List<Theme> updateTheme(@RequestParam (required = false) String newName, @RequestParam (required = false) String newDescription,@RequestParam Integer id){
		return themeServices.updateTheme(newName, newDescription, id);
	}
}
