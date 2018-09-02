package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FoodsRepository;
import com.example.demo.model.Foods;

@Service
@Transactional
public class FoodService {

	@Autowired
	private FoodsRepository foodDao;
	
	public List<Foods> getAllFoods(){
		return (List<Foods>) this.foodDao.findAll();
	}
	
	public Foods getFoodById( Integer id ) {
		return this.foodDao.findById( id ).get();
	}
}
