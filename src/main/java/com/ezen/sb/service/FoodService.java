package com.ezen.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.sb.mapper.FoodMapper;
import com.ezen.sb.model.FoodModel;

@Service
public class FoodService {
	@Autowired
	private FoodMapper foodMapper;

	public List<FoodModel> selectFoods(){
		return foodMapper.selectFoods();
	}
	public int insertFood(FoodModel foodMdel){
		return foodMapper.insertFood(foodMdel);
	}
	public int updateFood(FoodModel foodMdel){
		return foodMapper.updateFood(foodMdel);
	}
	public int deleteFood(FoodModel foodMdel){
		return foodMapper.deleteFood(foodMdel);
	}
}
