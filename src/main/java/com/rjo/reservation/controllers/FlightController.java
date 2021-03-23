package com.rjo.reservation.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rjo.reservation.entities.Flight;
import com.rjo.reservation.repository.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	FlightRepository flightRepository;

	/*
	 * @RequestMapping("findFlights") public String
	 * findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
	 * 
	 * @RequestParam("departureDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date
	 * departureDate, ModelMap modelMap) {
	 * 
	 * List<Flight> listOfFlights = flightRepository.findFlights(from, to,
	 * departureDate); modelMap.addAttribute("flights", listOfFlights);
	 * 
	 * return "dislplayFlights"; }
	 */
	
	@RequestMapping("findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
			ModelMap modelMap) {
		
		//List<Flight> listOfFlights = flightRepository.findFlights(from, to);
		List<Flight> listOfFlights = flightRepository.findAll();
		modelMap.addAttribute("flights", listOfFlights);
		
		return "displayFlights";
	}
}
