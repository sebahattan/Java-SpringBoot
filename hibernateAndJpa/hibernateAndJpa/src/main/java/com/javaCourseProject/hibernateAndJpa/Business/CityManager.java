package com.javaCourseProject.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaCourseProject.hibernateAndJpa.DataAccess.CityRepository;

import com.javaCourseProject.hibernateAndJpa.Entities.City;

@Service

public class CityManager implements ICityService {

	private CityRepository cityRepository;

	@Autowired
	public CityManager(CityRepository cityRepository) {
		super();
		this.cityRepository = cityRepository;
	}

	@Override
	public List<City> getAll() {
		return this.cityRepository.findAll();
	}

	@Override
	public City add(City city) {
		return this.cityRepository.save(city);

	}

	@Override
	public City update(City city) {
		return this.cityRepository.save(city);

	}

	@Override
	public Boolean delete(int id) {
		this.cityRepository.deleteById(id);
		return true;

	}

	@Override
	public City getById(int id) {

		return this.cityRepository.findById(id).orElse(null);

	}

}
