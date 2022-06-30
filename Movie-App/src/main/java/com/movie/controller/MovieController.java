package com.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.movie.dto.Movie;

@Controller
public class MovieController {
	@GetMapping("/addMovie")
	public ModelAndView addMovie(){
		return new ModelAndView("", "movie" , new Movie()); 
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(
	@ModelAttribute("movie")Movie movie,ModelMap model) 
	{ 
	  
	return ""; }
}
