package com.javaCourseProject.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaCourseProject.hibernateAndJpa.Entities.*;

import com.javaCourseProject.hibernateAndJpa.Business.ICityService;

@RestController
@RequestMapping("/api")
public class CityController {
	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}

	@GetMapping("/cities")
	public List<City> get() {
		return cityService.getAll();
	}

	@PostMapping("/add")
	public City add(@RequestBody City city) {
		return this.cityService.add(city);

	}

	@PostMapping("/update")
	public City update(@RequestBody City city) {
		return this.cityService.update(city);
	}

	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable int id) {
		return this.cityService.delete(id);
	}

	@GetMapping("/cities/{id}")
	public City getById(@PathVariable int id) {
		return cityService.getById(id);

	}

}
