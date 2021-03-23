package com.rjo.reservation.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.ModelMap;

import com.rjo.reservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	/*
	 * @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and "
	 * + " dateOfDeparture=:dateOfDeparture") List<Flight>
	 * findFlights(@Param("departureCity") String from, @Param("arrivalCity") String
	 * to,
	 * 
	 * @Param("dateOfDeparture") Date departureDate);
	 */
	
	@Query("from Flight where departurecity=:departurecity and arrivalcity=:arrivalcity ")
	 List<Flight> findFlights(@Param("departurecity") String from, @Param("arrivalcity") String to);

     //Flight findOne(long flightId);

}
