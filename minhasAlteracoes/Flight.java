package com.rjo.reservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Flight")
public class Flight extends AbstractEntity {

	@Column(name = "flightNumber")
	private String flightNumber;
	@Column(name = "operatingAirlines")
	private String operatingAirlines;
	//@Column(name = "departureCity")
	private String departureCity;
	@Column(name = "arrivalCity")
	private String arrivalCity;
	@Column(name = "dateOfDeparture")
	private Date dateOfDeparture;
	@Column(name = "estimateDepartureTime")
	private Timestamp estimateDepartureTime;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimateDepartureTime() {
		return estimateDepartureTime;
	}

	public void setEstimateDepartureTime(Timestamp estimateDepartureTime) {
		this.estimateDepartureTime = estimateDepartureTime;
	}

}
