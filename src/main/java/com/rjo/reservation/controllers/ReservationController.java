package com.rjo.reservation.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rjo.reservation.entities.Flight;
import com.rjo.reservation.repository.FlightRepository;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRepository;
	
	@RequestMapping("showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") long flightId, ModelMap modelMap) {
		Optional <Flight> flight = flightRepository.findById(flightId);
		if(flight.isPresent()) {
			modelMap.addAttribute("flight", flight.get());			
		} else {
			String msg = "Voo nao disponivel";
			modelMap.addAttribute("msg", msg);
		}
		return "completeReservation";
	}
}
