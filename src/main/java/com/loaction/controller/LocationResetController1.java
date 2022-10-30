package com.loaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loaction.entities.Locations;
import com.loaction.repository.LocationRepository;


@RestController
@RequestMapping
public class LocationResetController1 {
	@Autowired
	private LocationRepository locationRepo;
	
	@GetMapping("/locations")
	public List<Locations> getAllLocations(){
		List<Locations> locations= locationRepo.findAll();
		return locations;
	}
	@PostMapping("/save")
		public void saveLocation(@RequestBody Locations location) {
		locationRepo.save(location);
	}
	@PutMapping("/update")
	public void putLocation(@RequestBody Locations location) {
		locationRepo.save(location);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteLocation(@PathVariable("id") long id) {
		locationRepo.deleteById(id);
		
	}
	
		
		
		
	}


