package com.javaCourseProject.hibernateAndJpa.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaCourseProject.hibernateAndJpa.Entities.City;

public interface  CityRepository extends JpaRepository<City,Integer> {

}
