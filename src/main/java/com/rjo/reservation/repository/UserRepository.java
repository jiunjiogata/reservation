package com.rjo.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rjo.reservation.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {
	

	Usuario findByEmail(String email);

}
