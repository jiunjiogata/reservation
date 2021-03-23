package com.rjo.reservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flight")
public class Flight {

	@Id
	@Column(name = "identidade")
	private long identidade;
	@Column(name = "flightnumber")
	private String flightnumber;
	@Column(name = "operatingairlines")
	private String operatingairlines;
	@Column(name = "departurecity")
	private String departurecity;
	@Column(name = "arrivalcity")
	private String arrivalcity;
	@Column(name = "dateofdeparture")
	private Date dateofdeparture;
	@Column(name = "estimatedeparturetime")
	private Timestamp estimatedeparturetime;

	public long getIdentidade() {
		return identidade;
	}

	public void setIdentidade(long id) {
		this.identidade = id;
	}
	
	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightNumber) {
		this.flightnumber = flightNumber;
	}

	public String getOperatingairlines() {
		return operatingairlines;
	}

	public void setOperatingairlines(String operatingAirlines) {
		this.operatingairlines = operatingAirlines;
	}

	public String getDeparturecity() {
		return departurecity;
	}

	public void setdeparturedity(String departurecity) {
		this.departurecity = departurecity;
	}

	public String getArrivalcity() {
		return arrivalcity;
	}

	public void setArrivalcity(String arrivalCity) {
		this.arrivalcity = arrivalCity;
	}

	public Date getDateofdeparture() {
		return dateofdeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateofdeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedeparturetime() {
		return estimatedeparturetime;
	}

	public void setEstimatedeparturetime(Timestamp estimateDepartureTime) {
		this.estimatedeparturetime = estimateDepartureTime;
	}


}
