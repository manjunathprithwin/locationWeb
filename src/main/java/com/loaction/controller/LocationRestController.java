package com.loaction.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loaction.entities.Locations;
import com.loaction.repository.LocationRepository;

@RestController
public class LocationRestController {
	
	@Autowired
	private LocationRepository locationRepo;



	
	@RequestMapping("/location/{id}")
	public Locations getLocation(@PathVariable long id) {
		Optional<Locations> findById = locationRepo.findById(id);
		Locations location = findById.get();
		return location;

}
	}
