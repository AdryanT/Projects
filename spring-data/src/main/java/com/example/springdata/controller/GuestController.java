package com.example.springdata.controller;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdata.entity.Guest;
import com.example.springdata.repository.GuestRepository;

@RestController
@RequestMapping("/guests")
public class GuestController {
	
	private GuestRepository guestRepository;
	
	
	public GuestController(GuestRepository guestRepository) {
		super();
		this.guestRepository = guestRepository;
	}

	@GetMapping
	public Iterable<Guest> getAllGuests(){
		return this.guestRepository.findAll();
	}
	@GetMapping("/firstName")
	public List<Guest> findByFirstNameAndLastName(@RequestParam  String firstName, String lastName) {
		return guestRepository.findByFirstNameAndLastName(firstName, lastName);
	}

}