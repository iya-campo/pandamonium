package com.example.demo.controller;


import com.example.demo.model.Users;
import com.example.demo.model.Foods;
import com.example.demo.model.Bids;
import com.example.demo.service.FoodService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController{

	@Autowired
	private FoodService foodService;
	
	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "message", "Hello World!");
	}
	
	@GetMapping("/auction")
	public String auctionPage(Model model) {

		List<Foods> foodList = foodService.getAllFoods();
		
		
		model.addAttribute("foodList", foodList);
		
		
		return "auction";
	}

	@GetMapping("/getFoodData/{foodId}")
	@ResponseBody
	public Foods getFoodData( @PathVariable("foodId") Integer foodId ) {
		
		Foods food = foodService.getFoodById(foodId);
		
		return food;
		
	}

}
