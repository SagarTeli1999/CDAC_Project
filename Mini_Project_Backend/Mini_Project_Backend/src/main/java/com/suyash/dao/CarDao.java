package com.suyash.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.suyash.model.Car;

@Repository
public interface CarDao extends JpaRepository<Car, Integer> {
	
	public List<Car> findByLocation(@Param(value = "location") String location);
}
