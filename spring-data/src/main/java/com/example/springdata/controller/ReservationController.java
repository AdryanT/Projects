package com.example.springdata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdata.entity.Reservation;
import com.example.springdata.repository.ReservationRepository;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
	
	private ReservationRepository reservationRepository;
	
	
	public ReservationController(ReservationRepository reservationRepository) {
		super();
		this.reservationRepository = reservationRepository;
	}

	@GetMapping
	public Iterable<Reservation> getAllReservations(){
		return this.reservationRepository.findAll();
	}

}