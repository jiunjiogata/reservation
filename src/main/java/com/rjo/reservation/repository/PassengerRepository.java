package com.rjo.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rjo.reservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
