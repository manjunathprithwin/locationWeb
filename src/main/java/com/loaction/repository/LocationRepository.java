package com.loaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loaction.entities.Locations;

public interface LocationRepository extends JpaRepository<Locations, Long> {

}
