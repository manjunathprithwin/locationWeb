package com.loaction.servies;

import java.util.List;

import com.loaction.entities.Locations;

public interface LocationService {
	public void saveLocation(Locations location);

	public List<Locations> getLocationData();

}
