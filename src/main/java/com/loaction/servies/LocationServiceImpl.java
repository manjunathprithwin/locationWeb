package com.loaction.servies;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loaction.controller.dto.LocationsData;
import com.loaction.entities.Locations;
import com.loaction.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
@Autowired
	private LocationRepository locationRepo;
	
@Override
	public void saveLocation(Locations location) {
		locationRepo.save(location);
	}

@Override
public List<Locations> getLocationData() {
	List<Locations> locations = locationRepo.findAll();
	
	return locations;
}

}
