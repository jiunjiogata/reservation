package com.rjo.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rjo.reservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
