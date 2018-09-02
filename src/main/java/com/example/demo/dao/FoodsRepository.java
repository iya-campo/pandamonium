package com.example.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Foods;

@Repository
public interface FoodsRepository extends CrudRepository<Foods, Integer> {

	
}
