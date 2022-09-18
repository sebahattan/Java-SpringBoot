package com.javaCourseProject.hibernateAndJpa.Business;
import java.util.List;

import com.javaCourseProject.hibernateAndJpa.Entities.City;

public interface ICityService {
	
	
		List<City> getAll();
		City add(City city);
		City update(City city);
		Boolean delete(int id);
		City getById(int id);


}
