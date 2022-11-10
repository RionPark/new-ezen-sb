package com.ezen.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ezen.sb.model.FoodModel;
import com.ezen.sb.service.FoodService;

@Controller
public class FoodController {

	@Autowired
	private FoodService foodService;

	@GetMapping("/foods")
	public @ResponseBody List<FoodModel> getFoods(){
		return foodService.selectFoods();
	}
	
	@PostMapping("/foods")
	public @ResponseBody int addFood(@RequestBody FoodModel foodModel){
		return foodService.insertFood(foodModel);
	}
	
	@PostMapping("/foods/update")
	public @ResponseBody int modifyFood(@RequestBody FoodModel foodModel){
		return foodService.updateFood(foodModel);
	}
	
	@PostMapping("/foods/remove")
	public @ResponseBody int removeFood(@RequestBody FoodModel foodModel){
		return foodService.deleteFood(foodModel);
	}
}
