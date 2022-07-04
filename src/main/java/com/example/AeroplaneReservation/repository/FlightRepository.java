package com.example.AeroplaneReservation.repository;

import com.example.AeroplaneReservation.dto.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight,Integer> {

}
