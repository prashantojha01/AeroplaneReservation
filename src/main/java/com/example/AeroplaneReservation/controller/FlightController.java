package com.example.AeroplaneReservation.controller;

import com.example.AeroplaneReservation.dto.Flight;
import com.example.AeroplaneReservation.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FlightController {
    @Autowired
    private FlightService flightService;
    @GetMapping("/getAllFlight")
    public List<Flight> findAllFlight(){
        return flightService.findAllFlight();
    }
    @GetMapping("/get/{flight_number}")
    public Flight findFlight(@PathVariable int flight_number){
        return flightService.findFlight(flight_number);
    }

    @GetMapping("/search/{from_station}/{to_station}/{date_of_journey}/{number_of_seats_required}")
    public List<Flight> searchFlightBetweenStation(@PathVariable String from_station, @PathVariable String to_station, @PathVariable Date date_of_journey, @PathVariable int number_of_seats_required){
        return flightService.searchFlightBetweenStation(from_station,to_station,date_of_journey,number_of_seats_required);
    }
    @PostMapping("/book_ticket/{flight_number}/{number_of_passenger}")
    public Flight bookFlight(@PathVariable int flight_number,@PathVariable int number_of_passenger){
        return flightService.bookFlight(flight_number,number_of_passenger);
    }

}
