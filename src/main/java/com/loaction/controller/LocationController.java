package com.loaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.loaction.controller.dto.LocationsData;
import com.loaction.entities.Locations;
import com.loaction.servies.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping("/saveLocation")
	public String loadSaveLocationPage() {
		return "saveLocation";
	}
	
	@RequestMapping("/saveLocationData")
public String saveLocationData(@ModelAttribute("location") Locations location, ModelMap modelMap) {
locationService.saveLocation(location);
modelMap.addAttribute("msg","record is saved!!");
return "saveLocation";
	}
	
	
	
	
	/*@RequestMapping("/saveLocationData")
	public String saveLocationData(@RequestParam("id") long id,@RequestParam("codes") String codes,@RequestParam("name") String name,@RequestParam("type") String type, ModelMap ModelMap) {
	Locations location = new Locations();
	location.setId(id);
	location.setCodes(codes);
	location.setName(name);
	location.setType(type);
	
		locationService.saveLocation(location);
		ModelMap.addAttribute("msg", "record is saved!!");
	
	return "saveLocation";
	}*/
	
//	@RequestMapping("/saveLocationData")
//public String saveLocationData(LocationsData locationData, ModelMap modelMap) {
//		Locations location = new Locations();
//		location.setId(locationData.getId());
//		location.setCodes(locationData.getCodes());
//		location.setName(locationData.getName());
//		location.setType(locationData.getType()); 
//		
//		locationService.saveLocation(location);
//		modelMap.addAttribute("msg", "records is saved!!");
//		return "saveLocation";
//
//
//
//	}
	@RequestMapping( "/getLocations")
	public String getAllLocations(ModelMap modelMap) {
		List<Locations> locationData = locationService.getLocationData();
	modelMap.addAttribute("locations", locationData );
		
		return "searchResult";
	}

}

	
	
