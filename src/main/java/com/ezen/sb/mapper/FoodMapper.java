package com.ezen.sb.mapper;

import java.util.List;

import com.ezen.sb.model.FoodModel;

public interface FoodMapper {
	List<FoodModel> selectFoods();
	int insertFood(FoodModel foodMdel);
	int updateFood(FoodModel foodMdel);
	int deleteFood(FoodModel foodMdel);
}
